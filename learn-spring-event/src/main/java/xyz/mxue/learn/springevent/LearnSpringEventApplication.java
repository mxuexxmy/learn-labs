package xyz.mxue.learn.springevent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author mxuexxmy
 */
@EnableAsync
@SpringBootApplication
public class LearnSpringEventApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnSpringEventApplication.class, args);
    }

}
