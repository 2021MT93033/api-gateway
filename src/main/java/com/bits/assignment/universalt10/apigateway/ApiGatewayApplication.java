package com.bits.assignment.universalt10.apigateway;

import org.apache.logging.log4j.message.SimpleMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@EnableZuulProxy
@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

	@GetMapping("/health")
	public ResponseEntity<SimpleMessage> healthCheck() {
		return ResponseEntity.ok(new SimpleMessage("The API Gateway is functioning"));
	}

}
