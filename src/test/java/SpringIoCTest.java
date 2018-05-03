import com.wang.ioc.service.SayService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wang on 2018/5/3.
 */
public class SpringIoCTest {
    @Test
    public void test1(){
        ApplicationContext act=new ClassPathXmlApplicationContext("bean.xml");
        SayService sayService=(SayService)act.getBean("test");
        sayService.say();
    }
}
