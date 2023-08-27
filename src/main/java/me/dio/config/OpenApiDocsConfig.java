package me.dio.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static me.dio.utils.ConstantsUtils.*;

@Configuration
public class OpenApiDocsConfig {

    @Bean
    public OpenAPI sistemaCobrancaOpenAPI() {
        return new OpenAPI()
                .info(infoOpenAPI()
                        .license(licenseOpenAPI())
                        .contact(contactOpenAPI()))
                .externalDocs(new ExternalDocumentation());
    }

    private Info infoOpenAPI() {
        return new Info()
                .title(API_DOCS_TITLE)
                .description(API_DOCS_DESCRITPION)
                .version(API_DOCS_VERSION)
                .termsOfService(API_DOCS_TERMS_OF_USE);
    }

    private License licenseOpenAPI() {
        return new License()
                .name(API_DOCS_LICENSE_NAME)
                .url(API_DOCS_LICENSE_URL);
    }

    private Contact contactOpenAPI() {
        return new Contact()
                .name(API_DOCS_CONTACT_NAME)
                .url(API_DOCS_CONTACT_URL)
                .email(API_DOCS_CONTACT_EMAIL);
    }
}