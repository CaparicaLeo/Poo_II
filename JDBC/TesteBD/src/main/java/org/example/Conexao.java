package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/curso";
        String usuario = "postgres";
        String senha = "001326";

        try {
            Connection connection = DriverManager.getConnection(url,usuario,senha);
            System.out.println("Conexao realizada com sucesso!");
            connection.close();
        } catch (SQLException erro) {
            System.out.println("Problemas na conexao com a fonte de dados"	+ erro.toString());
        }
    }
}