import com.demo1.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext user1 = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User)user1.getBean("MyUser1");
        user.show();
    }
}
