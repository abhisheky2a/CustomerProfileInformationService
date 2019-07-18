package com.info.customer.telecom.kool;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.info.customer.telecom.kool")
@EnableSwagger2
public class CustomerProfileInformationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerProfileInformationServiceApplication.class, args);
	}
	
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
	
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())                          
          .build().apiInfo(apiInfo());                                          
    }
    
    private ApiInfo apiInfo() {
        return new ApiInfo(
          "CustomerProfileInformation", 
          "Provided APIs are used to perform CRUD Operarions in Customer Profile Information", 
          "API KoolTelecom", 
          "Terms of service", 
          new Contact("Abhishek Chakraborty", "", "abhishek.y2a@gmail.com"), 
          "License of API", "API license URL", Collections.emptyList());
    }

}
