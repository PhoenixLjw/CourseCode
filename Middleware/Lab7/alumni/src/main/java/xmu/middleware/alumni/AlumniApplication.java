package xmu.middleware.alumni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author jason
 */
@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient
public class AlumniApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlumniApplication.class, args);
    }

}
