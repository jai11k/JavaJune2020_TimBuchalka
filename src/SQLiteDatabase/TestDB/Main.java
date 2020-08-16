package SQLiteDatabase.TestDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Main
{
    public static void main(String[] args)
    {
         try
         {
             Connection conn= DriverManager.getConnection("jdbc:sqlite:C:\\Users\\karan\\IdeaProjects\\JavaJune2020_TimBuchalka\\src\\SQLiteDatabase\\TestDB\\testjava.db");
             Statement statement=conn.createStatement();
//             statement.execute("CREATE TABLE IF NOT EXISTS contacts (Name TEXT,Phone INTEGER,Email TEXT)");
//             statement.execute("INSERT INTO contacts(Name,Phone,Email) VALUES('Karan',85345,'karan@gmail.com') ");
//             statement.execute("INSERT INTO contacts(Name,Phone,Email) VALUES('JAI',854545,'karan1@gmail.com') ");
//             statement.execute("INSERT INTO contacts(Name,Phone,Email) VALUES('Sodhi',853145,'karan2@gmail.com') ");
//             statement.execute("INSERT INTO contacts(Name,Phone,Email) VALUES('Harman',5498645,'karan3@gmail.com') ");
//             statement.execute("INSERT INTO contacts(Name,Phone,Email) VALUES('Anmol',5495645,'karan4@gmail.com') ");
//             statement.execute("UPDATE contacts SET Phone=981533 WHERE Name='Karan'");

             statement.execute("DELETE FROM contacts WHERE Name= 'Anmol' ");
            statement.close();
             conn.close();
         }catch (SQLException e)
         {
             System.out.println("Something went wrong : "+e.getMessage());
         }

    }
}

