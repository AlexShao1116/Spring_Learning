import com.shao.service.UserService;
import com.shao.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取Applicationcontext，拿到spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //容器在手，调用方法
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("ServiceImpl");
        userServiceImpl.getUser();
    }

}
