import com.gpw.bean.Employee;
import com.gpw.dao.EmployeeDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;


public class MyBatisCRUDTest {
    SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        String resource = "mybatis_config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testInsert() throws IOException {
        SqlSession session = sqlSessionFactory.openSession(true);
        EmployeeDao employeeDao = session.getMapper(EmployeeDao.class);
        Employee employee = new Employee(null, "cbx", "cbx@163.com", 1);
        try {
            int i = employeeDao.insertEmployee(employee);
            System.out.println(i);
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
}