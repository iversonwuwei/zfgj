import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by walden on 2017/2/15.
 */
@SpringBootApplication
@EnableWebMvc
@ComponentScan(basePackages = {"com.dlfc.zfgj"})
public class ContractApplication {

    public static void main(String[] args){
        SpringApplication.run(ContractApplication.class, args);
    }
}
