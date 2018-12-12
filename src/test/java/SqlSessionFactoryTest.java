import com.azure.mall.mappers.AdminMapper;
import com.azure.mall.mappers.UserMapper;
import com.azure.mall.models.Admin;
import com.azure.mall.models.User;
import com.azure.spring.config.context.SpringSharedContextConfig;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringSharedContextConfig.class)
public class SqlSessionFactoryTest {

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private Logger testLogger;

    //private Logger testLogger= Logger.getLogger("testLogger");

    @Test
    public void getAdmins(){
        for(Admin admin:adminMapper.selectAdminsByName("scott"))
            testLogger.info(admin);
    }

    @Test
    public void getUsers(){
        for(User user:userMapper.selectUsersByUsername("南波湾"))
            testLogger.info(user);
    }
}
