package _Basic.TestDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args)
    {
        try
        {
            Connection conn= DriverManager.getConnection("C:\\Users\\karan\\Downloads\\sqlite-jdbc-3.30.1.jar.db");

        }catch (SQLException  e)
        {
            System.out.println("Something went Wrong." +e.getMessage());
        }
           }
}
