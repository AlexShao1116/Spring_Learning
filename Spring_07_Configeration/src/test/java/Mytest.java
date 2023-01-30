import com.demo1.config.Myconfig;
import com.demo1.pojo.Dog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mytest {
    @Test
    public void test1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Myconfig.class);
        Dog dog1 = (Dog)context.getBean("dog11");
        System.out.println(dog1);
    }
}
