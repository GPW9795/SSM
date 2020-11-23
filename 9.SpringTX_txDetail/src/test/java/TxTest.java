import com.gpw.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TxTest {

    ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");

    @Test
    public void test() {
        BookService bookService = ioc.getBean(BookService.class);

        bookService.checkout("Tom", "ISBN-001");
    }

}
