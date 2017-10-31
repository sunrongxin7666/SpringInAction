package soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerJavaConfig.class)
public class TesterImpJavaConfigTest {
    @Autowired private ITester iTester;
    @Test
    public void isNotNull(){
        assertNotNull(iTester);
    }

    @Test
    public void getNum() throws Exception {
        assertTrue(iTester.getNum()==4);
    }

}