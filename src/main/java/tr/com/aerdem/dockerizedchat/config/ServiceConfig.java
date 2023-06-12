package tr.com.aerdem.dockerizedchat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ServiceConfig {
	@Bean
	public RestTemplate restTemplae() {
		return new RestTemplate();
	}

}
