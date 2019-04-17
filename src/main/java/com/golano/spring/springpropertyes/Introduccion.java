/*
 * Implementación Ejemplo Introducción Spring
 * http://acodigo.blogspot.com/2017/02/spring-tutorial-de-introduccion.html
 * Creación de Clase de contenedor y prueba
 */
package com.golano.spring.springpropertyes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * 17/04/2019   
 * @author golanot
 */
public class Introduccion {

    public static void main(String[] args) {
        AbstractApplicationContext ctx = 
                new AnnotationConfigApplicationContext(SpringConfiguration.class);
        HelloService saluda = ctx.getBean("saludaService",HelloService.class);
        saluda.saludar();
        ctx.close();
    }    
}
