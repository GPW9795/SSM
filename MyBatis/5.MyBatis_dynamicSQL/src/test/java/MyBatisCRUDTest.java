import com.gpw.bean.Teacher;
import com.gpw.dao.TeacherDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class MyBatisCRUDTest {
    SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        String resource = "mybatis_config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }


    @Test
    public void test01() throws IOException {
        SqlSession session1 = sqlSessionFactory.openSession();
        SqlSession session2 = sqlSessionFactory.openSession();
        TeacherDao teacherDao1 = session1.getMapper(TeacherDao.class);
        TeacherDao teacherDao2 = session2.getMapper(TeacherDao.class);

        Teacher teacher1 = teacherDao1.getTeacherById(1);
        System.out.println(teacher1);
        session1.close();

        Teacher teacher2 = teacherDao2.getTeacherById(1);
        System.out.println(teacher2);
        session2.close();
    }

    @Test
    public void test() throws IOException {
        SqlSession session = sqlSessionFactory.openSession(true);
        TeacherDao teacherDao = session.getMapper(TeacherDao.class);
        try {
            Teacher teacher = new Teacher();
//            teacher.setId(1);
            teacher.setName("jerry");
            List<Teacher> list = teacherDao.getTeacherByConditionChoose(teacher);
            for (Teacher tea : list) {
                System.out.println(tea);
            }
        } finally {
            session.close();
        }
    }

    @Test
    public void update() throws IOException {
        SqlSession session = sqlSessionFactory.openSession(true);
        TeacherDao teacherDao = session.getMapper(TeacherDao.class);
        try {
            Teacher teacher = new Teacher();
//            teacher.setId(1);
            teacher.setId(1);
            teacher.setName("jerry");
            int i = teacherDao.updateTeacher(teacher);
            System.out.println(i);
        } finally {
            session.close();
        }
    }
}