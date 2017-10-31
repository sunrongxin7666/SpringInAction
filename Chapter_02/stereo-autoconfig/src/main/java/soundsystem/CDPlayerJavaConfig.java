package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Spring配置
@Configuration
public class CDPlayerJavaConfig {
    @Bean
    public ITester TesterImp(){
        return new TesterImp(null, 4);
    }
}
