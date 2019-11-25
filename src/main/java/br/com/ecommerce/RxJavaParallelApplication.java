package br.com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RxJavaParallelApplication {

	public static void main(String[] args) {
		SpringApplication.run(RxJavaParallelApplication.class, args);
	}

}
