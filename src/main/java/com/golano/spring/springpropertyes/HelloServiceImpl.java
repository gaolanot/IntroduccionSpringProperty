/*
 * Implementación Ejemplo Introducción Spring
 * http://acodigo.blogspot.com/2017/02/spring-tutorial-de-introduccion.html
 * Creación de Clase para Servicio Hello \ implementa de HelloService
 */
package com.golano.spring.springpropertyes;

/**
 * 16/04/2019
 * @author gaolanot
 */
public class HelloServiceImpl implements HelloService{
    private String mensaje;

    public HelloServiceImpl(){
        this.mensaje = "";
    }
    
    public HelloServiceImpl(String msg){
        this.mensaje = msg;
    }
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }    
    //Implementación método saludar
    @Override
    public void saludar() {
        System.out.println("\\_(°°)_/ ....."+this.mensaje);
    }
}
