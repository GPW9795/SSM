import com.gpw.bean.Employee;
import com.gpw.dao.EmployeeDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisTest {
    @Test
    public void test() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        Employee employee = null;
        SqlSession session = sqlSessionFactory.openSession();
        try {
            EmployeeDao employeeDao = session.getMapper(EmployeeDao.class);
            employee = employeeDao.getEmpById(1);
        } finally {
            session.close();
        }
        System.out.println(employee);
    }
}
