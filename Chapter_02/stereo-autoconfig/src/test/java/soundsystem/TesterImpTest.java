package soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

//Spring测试环境
@RunWith(SpringJUnit4ClassRunner.class)
//Spring环境上下文
@ContextConfiguration(classes = CDPlayerConfig.class)
public class TesterImpTest {
    @Autowired TesterImp testerImp;

    @Test
    public void isNotNull(){
        assertNotNull(testerImp);
    }

    @Test
    public void numEqual(){
        assertTrue(testerImp.getNum()==3);
    }
}