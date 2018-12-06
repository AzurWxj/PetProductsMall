import com.azure.mall.mapper.AdminMapper;
import com.azure.mall.mapper.UserMapper;
import com.azure.mall.model.Admin;
import com.azure.mall.model.User;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-config.xml"})
public class SqlSessionFactoryTest {

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private UserMapper userMapper;

    private Logger logger= Logger.getLogger("testLogger");

    @Test
    public void getAdmins(){
        for(Admin admin:adminMapper.selectAdminsByName("scott"))
            logger.fatal(admin);
    }

    @Test
    public void getUsers(){
        for(User user:userMapper.selectUsersByUsername("南波湾"))
            logger.fatal(user);
    }
}
