package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AppBd {
    
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
        }catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
           System.err.println("Não foi possível carregar a classe do BD" + e.getMessage());
        }
      
        try {
            try(var conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "gitpod", "")) {
                System.out.println("Conectado ao BD");    

                var statement = conn.createStatement();
                var result = statement.executeQuery("select * from estado");

                while (result.next()) {
                    System.out.printf("Id: %d Nome: %s UF: %s \n", result.getInt("id"), result.getString("nome"), result.getString("uf"));   
                }

            } 
        } catch (SQLException e) {
            System.err.println("Não foi possível conectar ao BD" + e.getMessage() );
        }
      
      
      
      
        /*   Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "gitpod", "");
            System.out.println("Conectado ao BD");

            var statement = conn.createStatement();
            var result = statement.executeQuery("select * from estado");
            while (result.next()) {
                System.out.printf("Id: %d Nome: %s UF: %s \n", result.getInt("id"), result.getString("nome"), result.getString("uf"));
                
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
           System.err.println("Não foi possível carregar a classe do BD" + e.getMessage());
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
            System.err.println("Não foi possível conectar ao BD" + e.getMessage() );
        }finally{
            if (conn != null) {
                conn.close();
            }
        } */
    }

}
