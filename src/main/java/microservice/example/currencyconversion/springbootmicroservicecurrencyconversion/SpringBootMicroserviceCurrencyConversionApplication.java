package microservice.example.currencyconversion.springbootmicroservicecurrencyconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("microservice.example.currencyconversion")
public class SpringBootMicroserviceCurrencyConversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroserviceCurrencyConversionApplication.class, args);
	}

}

