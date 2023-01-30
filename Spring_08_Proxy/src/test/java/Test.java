import com.demo1.ih.ProxyInvocationHandler;
import com.demo1.service.Service;
import com.demo1.service.UserServiceImpl;


public class Test {
    public static void main(String[] args) {
        //真实对象
        UserServiceImpl userService = new UserServiceImpl();
        //代理对象的调用处理程序
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService); //设置要代理的对象
        Service proxy = (Service)pih.getProxy(); //动态生成代理类！
        proxy.delete();
    }
}

