package com.example;

import java.sql.DriverManager;
import java.sql.SQLException;

public class AppBd {
    
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            var conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "gitpod", "");
            System.out.println("Conectado ao BD");

            var statement = conn.createStatement();
            var result = statement.executeQuery("select * from estado");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
           System.err.println("Não foi possível carregar a classe do BD" + e.getMessage());
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
            System.err.println("Não foi possível conectar ao BD" + e.getMessage() );
        }
    }

}
