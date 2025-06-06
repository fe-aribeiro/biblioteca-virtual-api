package br.com.desafio.livraria.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenAPIConfig {
    @Bean
    OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("API Biblioteca")
                .version("1.0")
                .description("Gerenciamento de Livros, Autores e Assuntos. Gera também relatório em PDF agrupado por autor."));
    }
}