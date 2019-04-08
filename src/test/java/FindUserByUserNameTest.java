import cn.gjz.dao.UserDao;
import cn.gjz.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @auther GuJunzhou
 * @date 2019/3/19 14:34
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class FindUserByUserNameTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testFindUserById() {
        String username ="admin";
        User user = userDao.findUserByUserName(username);
        System.out.println(user.getId() + ":" + user.getUsername());
    }
}
