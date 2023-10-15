package ServiceTest;

import com.jiahao.Config.Springconfig;
import com.jiahao.DAO.Usermapper;
import com.jiahao.Domain.User;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;

@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(classes = Springconfig.class)
public class MapperTest {
    @Autowired
    private Usermapper usermapper;
    @Test
    public void Mtest(){
        AnnotationConfigApplicationContext actx = new AnnotationConfigApplicationContext(Springconfig.class);
        Usermapper bean = actx.getBean(Usermapper.class);
        User user = bean.selectByid(2);
        System.out.println(user);

    }
}
