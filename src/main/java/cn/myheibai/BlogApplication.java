package cn.myheibai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class BlogApplication {
	public static void main(String[] args) {
		//禁用自动重启
		//System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(BlogApplication.class, args);
	}
}
