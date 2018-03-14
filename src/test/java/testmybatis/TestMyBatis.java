package testmybatis;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.cn.eddy.pojo.UnlockUser;
import com.cn.eddy.service.UnlockUserService;

import javax.annotation.Resource;

/**
 * Created By Eddy on ${Date}
 *
 * 测试spring
 */
@RunWith(SpringJUnit4ClassRunner.class) //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath*:spring-mybatis.xml"})
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);

    @Resource
    private UnlockUserService unlockUserService;

    @Test
    public void test1(){
        UnlockUser unlockUser = unlockUserService.getUserById(555566l);
        logger.info(JSON.toJSONString(unlockUser));
    }
}
