package com.svv.loan.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class LoanMsConfig {
	
	@Value("${bank.ms.base.url}")
	private String baseUrl;
	
	@Bean
	public WebClient webClient()
	{
		return WebClient.builder()
				.baseUrl(baseUrl)
				.build();
	}

}
