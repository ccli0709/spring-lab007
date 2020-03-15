package tw.ccli0709.lab007;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "tw.ccli0709.lab007.dao")
public class SpringLab007Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringLab007Application.class, args);
	}

}
