package ru.test.db;


import java.sql.*;

/**
 * Created by Константин on 14.08.2014.
 */
public class DBConnection {
    private Connection connection;
    private String url = "jdbc:mysql://178.62.184.61/mydb";
    private String name = "kostkol";
    private String password = "chatru666";

    public Connection init() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("JDBC driver was loaded successfully!");
        connection = DriverManager.getConnection(url, name, password);
        System.out.println("Connection to DB was success!");
        Statement statement = connection.createStatement();
        statement.execute("CREATE table if not exists mydb.accounts(id int primary key, amount bigint) ;");
        return connection;
//        //let's add few users
//        ResultSet resultSet = statement.executeQuery("select * from accounts where id=0;");
//
//        if (resultSet.equals(null)) {
//            for (int i = 0; i < 50; i++) {
//                statement.execute("insert ignore into accounts (id, amount) values (" + i + ", 0);");
//                System.out.println("account was created!");
//            }
//        }else {
//            System.out.println("There are already 50 accounts with id range 0-49");
//        }
    }

}
