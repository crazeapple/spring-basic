import com.ggli.aop.model.Tutorial;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ggli on 2016/8/23.
 */
public class UnitTest {

    @Test
    public void testObject() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Tutorial tutorial = (Tutorial) context.getBean("tutorial1");
        tutorial.printName();
        System.out.println("------------------------------");
        tutorial.printUrl();
        System.out.println("------------------------------");

        try {
            tutorial.printThrowException();
        } catch (Exception e) {

        }
    }

    @Test
    public void testAdvice() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Tutorial tutorial = (Tutorial) context.getBean("proxy1");
        tutorial.printName();
        System.out.println("------------------------------");
        tutorial.printUrl();

        try {
            tutorial.printThrowException();
        } catch (Exception e) {

        }
    }

    @Test
    public void testAround() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Tutorial tutorial = (Tutorial) context.getBean("proxy2");
        tutorial.printName();
        System.out.println("------------------------------");
        tutorial.printUrl();

        try {
            tutorial.printThrowException();
        } catch (Exception e) {

        }
    }

}
