package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.lang.IO.println;

public class DataBase {

    private Connection connection = null;

    public DataBase() throws SQLException {
        if(!connect()){
            println("NON sei connesso");
            System.exit(-1);
        }
        println("Sei connesso");

    }

    private boolean connect() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:database.db");
        } catch (SQLException e){
            return false;
        }
        return true;
    }



    public void SelectAll(){
        String query = "SELECT * FROM menu";

        Statement statement = connection.prepareStatement(query);
        ResultSet rs = statement.executeLargeUpdate();

    }



}
