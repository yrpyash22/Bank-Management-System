package bank.management.system;

import java.sql.*;

public class DBConnection {

    private static final String url = "jdbc:mysql://localhost:3306/bankSystem";
    private static final String username = "YOUR_USERNAME";
    private static final String password = "YOUR_PASSWORD";


    Connection connection;
    Statement statement;
    public DBConnection()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }


        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","YOUR_USERNAME","YOUR_PASSWORD");
            statement = connection.createStatement();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
