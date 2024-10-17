package com.web_api.doc;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "API - Web API",
                version = "1.0.0",
                description = "Documentação da API Web API",
                termsOfService = "Termos de uso: Open Source",
                contact = @Contact(
                        name = "Maciel",
                        url = "https://github.com/srmatheusmaciel",
                        email = "https://linkedin.com/srmatheusmaciel"
                ),
                license = @License(
                        name = "Licença: Open Source",
                        url = "https://github.com/srmatheusmaciel"
                )
        )
)
public class SwaggerConfig {
    // Não é necessário um Docket, pois a anotação @OpenAPIDefinition cobre a configuração da API.
}
