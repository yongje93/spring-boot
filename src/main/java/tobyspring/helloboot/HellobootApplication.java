package tobyspring.helloboot;

import org.springframework.boot.SpringApplication;
import tobyspring.config.MySpringBootApplication;

@MySpringBootApplication
public class HellobootApplication {

//    @Bean
//    ApplicationRunner applicationRunner(Environment env) {
//        return args -> {
//            String name = env.getProperty("my.name");
//            System.out.println("my.name: " + name);
//        };
//    }

    public static void main(String[] args) {
        SpringApplication.run(HellobootApplication.class, args);
    }

}
