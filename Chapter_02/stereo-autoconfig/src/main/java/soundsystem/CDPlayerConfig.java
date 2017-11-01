package soundsystem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Spring配置
@Configuration
//自动扫描其所在的包
@ComponentScan
public class CDPlayerConfig {
    @Bean
    public ITester TesterImp(){
        return new TesterImp(null);
    }
}
