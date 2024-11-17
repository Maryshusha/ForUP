package com.example.coursework;

import java.sql.*;

public class db {
    public static Connection connectDb(){
        Connection connect = null;
        try{
            Class.forName("org.postgresql.Driver");
            connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
            connect.setSchema("kurs");
        } catch (Exception e){
            e.printStackTrace();
        }
        return connect;
    }
}