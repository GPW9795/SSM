import com.gpw.impl.MyMathCalculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");

    @Test
    public void test03() {
        MyMathCalculator bean = ioc.getBean(MyMathCalculator.class);
        int add = bean.add(1, 1);
        System.out.println("================" + add);
    }

    @Test
    public void test02() {
        MyMathCalculator bean = ioc.getBean(MyMathCalculator.class);
        bean.div(1, 1 );
    }

    @Test
    public void test() {
        MyMathCalculator bean = (MyMathCalculator) ioc.getBean("myMathCalculator");
        bean.add(1, 2);
        System.out.println(bean.getClass());
    }
}

