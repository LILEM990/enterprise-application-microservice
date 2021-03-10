package tcu.zc.service.spring.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringHelloApplication {

	@GetMapping("/hello/{name}")
	public String hello(@PathVariable String name){
		return String.format("Hello,%s!",name);
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringHelloApplication.class, args);
	}

}
