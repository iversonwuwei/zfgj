import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by walden on 2017/2/20.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.dlfc.zfgj"})
public class SecurityApplication {

    public static void main(String[] args){
        SpringApplication.run(SecurityApplication.class, args);
    }
}
