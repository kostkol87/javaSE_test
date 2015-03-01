package DbTransfer;

import java.sql.*;

public class CreateAndFillDb {
    private String url = "jdbc:postgresql://127.0.0.1:5432/mydb";
    private String name = "postgres";
    private String password = "postgres";
    public void myDB() throws ClassNotFoundException {
        Connection connection = null;

        try{
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded!");
            connection= DriverManager.getConnection(url, name, password);
            System.out.println("Connection succeed!");

            Statement statement = connection.createStatement();
            statement.execute("create table public.Country(id int primary key not null, name varchar not null ) if not exists ");


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
