import com.gpw.bean.Cat;
import com.gpw.bean.Employee;
import com.gpw.bean.Key;
import com.gpw.bean.Lock;
import com.gpw.dao.CatDao;
import com.gpw.dao.EmployeeDao;
import com.gpw.dao.KeyDao;
import com.gpw.dao.LockDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;


public class MyBatisCRUDTest {
    SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        String resource = "mybatis_config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void locktest() throws IOException {
        SqlSession session = sqlSessionFactory.openSession(true);
        LockDao lockDao = session.getMapper(LockDao.class);
        try {
            Lock lock = lockDao.getLockById(3);
            System.out.println(lock);
            for (Key key : lock.getKeys()) {
                System.out.println(key);
            }
        } finally {
            session.close();
        }
    }

    @Test
    public void keytest() throws IOException {
        SqlSession session = sqlSessionFactory.openSession(true);
        KeyDao keyDao = session.getMapper(KeyDao.class);
        try {
            Key key = keyDao.getKeyById(1);
            System.out.println(key);
        } finally {
            session.close();
        }
    }

    @Test
    public void catest() throws IOException {
        SqlSession session = sqlSessionFactory.openSession(true);
        CatDao catDao = session.getMapper(CatDao.class);
        try {
            Cat cat = catDao.geCatById(1);
            System.out.println(cat);
        } finally {
            session.close();
        }
    }

    @Test
    public void testInsert() throws IOException {
        SqlSession session = sqlSessionFactory.openSession(true);
        EmployeeDao employeeDao = session.getMapper(EmployeeDao.class);
        Employee employee = new Employee(null, "cbx", "cbx@163.com", 1);
        try {
            int i = employeeDao.insertEmployee(employee);
            System.out.println(employee.getId());
            System.out.println(employee);
        } finally {
            session.close();
        }
    }

    @Test
    public void testQuery() throws IOException {
        SqlSession session = sqlSessionFactory.openSession();
        EmployeeDao employeeDao = session.getMapper(EmployeeDao.class);
        Employee employee;
        try {
            employee = employeeDao.getEmpById(1);
            System.out.println(employee);
        } finally {
            session.close();
        }
    }

    @Test
    public void testQueryTwo() throws IOException {
        SqlSession session = sqlSessionFactory.openSession();
        EmployeeDao employeeDao = session.getMapper(EmployeeDao.class);
        Employee employee;
        try {
            employee = employeeDao.getEmpByIdAndName(1, "gpw");
            System.out.println(employee);
        } finally {
            session.close();
        }
    }

    @Test
    public void testQueryAll() throws IOException {
        SqlSession session = sqlSessionFactory.openSession();
        EmployeeDao employeeDao = session.getMapper(EmployeeDao.class);
        try {
            List<Employee> list = employeeDao.getEmps();
            for (Employee employee : list) {
                System.out.println(employee);
            }
        } finally {
            session.close();
        }
    }

    @Test
    public void testQueryMap() throws IOException {
        SqlSession session = sqlSessionFactory.openSession();
        EmployeeDao employeeDao = session.getMapper(EmployeeDao.class);
        Employee employee;
        try {
            Map<String, Object> map = employeeDao.getEmpByIdMap(1);
            System.out.println(map);
        } finally {
            session.close();
        }
    }

    @Test
    public void testQueryMapAll() throws IOException {
        SqlSession session = sqlSessionFactory.openSession();
        EmployeeDao employeeDao = session.getMapper(EmployeeDao.class);
        Employee employee;
        try {
            Map<Integer, Employee> map = employeeDao.getEmpsMap();
            System.out.println(map.get(1).getEmpName());
        } finally {
            session.close();
        }
    }
}