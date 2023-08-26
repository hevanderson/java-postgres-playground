package com.example;

import java.util.Scanner;

public class AppScanner {
    public static void main(String[] args) {

        Cliente cliente01 = new Cliente();
        Scanner scanner1  = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        cliente01.setNome(scanner1.nextLine());

        System.out.println("Digite seu sexo (M ou F): ");
        String sexo = scanner1.nextLine();
        cliente01.setSexo(sexo.charAt(0));
        
        System.out.println("Digite seu Ano de Nascimento: ");
        cliente01.setAnoNascimento(scanner1.nextInt());
        scanner1.nextLine(); //quando for a leitura de campo numerico, adicionar um nextline no final

         
        cliente01.setRenda(5000);
        //cliente01.setSexo('M');
        //cliente01.setAnoNascimento(1988);
        cliente01.setEspecial(true);
        //cliente01.setNome("Maurício");

        System.out.println("Novo Cliente: ");
        System.out.println("Nome: " + cliente01.getNome());
        System.out.println("Ano de Nascimento: " + cliente01.getAnoNascimento() );
        System.out.println("Renda: " + cliente01.getRenda() );        
        
    }
}
