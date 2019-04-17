/*
 * Implementación Ejemplo Introducción Spring con archivo de Propiedades
 * http://acodigo.blogspot.com/2017/03/spring-archivo-de-propiedades-externo.html
 * Creación de Clase de configuración para Spring 
 */
package com.golano.spring.springpropertyes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
/* 17/04/2019
 * @author gaolanot
 */
@Configuration
@PropertySource("classpath:application.properties")  //llamar archivo prop
public class SpringConfiguration {
    
    @Value("${autor}")                               //llamado a la propiedad
    private String mensaje;                          //se almacena en mensaje
    
    @Bean
    public static PropertySourcesPlaceholderConfigurer //Se crea el bean
        propertySourcesPlaceholderConfigurer(){        //que configura la func.
        return new PropertySourcesPlaceholderConfigurer();
    }
        
    @Bean
    public HelloService saludaService(){
        return new HelloServiceImpl(mensaje);
    }
}
