package com.examen;

import java.util.logging.Logger;
import java.lang.*;
import java.io.*;
import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        logger.info("Iniciar Sesion:");
        Scanner sc = new Scanner(System.in);
        logger.info("Usuario: ");
        String user = sc.nextLine();
        logger.info("Contraseña: ");
        String password = sc.nextLine();
        Login login  = new Login(user,password);

        if(login.login()){
            logger.info("Avance de la Vacunación");
            logger.info("Cobertura de la Vacunación");
            logger.info("Número de Centros de Vacunación");
            logger.info("Número de personas vacunadas parcialmente");
            logger.info("Número de personas vacunadas completamente");
            logger.info("Logout");
        }


    }
}