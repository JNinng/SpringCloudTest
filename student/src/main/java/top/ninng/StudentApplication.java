package top.ninng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * student 服务
 */
@SpringBootApplication
@EnableDiscoveryClient
public class StudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class);
    }
}
