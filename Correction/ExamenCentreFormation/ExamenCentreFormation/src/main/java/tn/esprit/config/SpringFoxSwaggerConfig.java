package tn.esprit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SpringFoxSwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo ())
				.select()
				.apis(RequestHandlerSelectors.basePackage("tn.esprit.controllers"))
				.paths(PathSelectors.any())
				.build();
		

	}

	private ApiInfo apiInfo () {
		return new ApiInfoBuilder()
				.title("Swagger Configuration for tpStockProject")
				.contact(new Contact("Atef MADDOURI", "https://www.linkedin.com/in/atef-maddouri/", "atef.maddouri@esprit.tn"))
				.description("\"Spring Boot Swagger configuration\"")
				.version("1.1.0")
				.build();
	}

}
