package academy.devdojo.youtube.core.docs;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

public class BaseSwaggerConfig {

    private final String basePackage;

    public BaseSwaggerConfig(String basePackage) {
        this.basePackage = basePackage;
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage(basePackage))
                .build()
                .apiInfo(metaDate());
    }

    private ApiInfo metaDate() {
        return new ApiInfoBuilder()
                .title("Another Awesome course from DevDojo, Spring Boot Microservices")
                .description("Everybody is a Jedi now")
                .version("1.0")
                .contact(new Contact("Yves Guilherme as the Jedi Master", "https://github.com/yvesguilherme", "yveslopo@gmail.com"))
                .license("Private stuff bro, belongs to Yves Guilherme")
                .licenseUrl("https://github.com/yvesguilherme")
                .build();
    }
}
