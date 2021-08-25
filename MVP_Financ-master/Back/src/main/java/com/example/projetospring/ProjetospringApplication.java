package com.example.projetospring;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetospringApplication {

    public static void main(String[] args) {       
    	
    	SpringApplication.run(ProjetospringApplication.class, args);

    	
    }
    
}
    
    	/*
        SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Cadastre sua conta abaixo");
        System.out.println("-------------------------");
        
        Scanner sc1 = new Scanner(System.in);
        
        Date data = date1.parse("oi");
        System.out.println(date1.format(data));

        String nome;
        nome = sc1.next();
        String categoria;
        categoria = sc1.next();
        double valor;
        valor = sc1.nextDouble();
        
        System.out.println("Conta:" + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Valor: " + valor);
           
        sc1.close();
 
    
    
    */

