package SQLiteDatabase.TestDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Main
{
     static   String currentDir = System.getProperty("user.dir");
    public static final String DB_Name ="testjava1.db";
    public static final String Connection_String="jdbc:sqlite: "+currentDir+"\\src\\SQLiteDatabase\\TestDB\\" +DB_Name ;
    public static final String Table_Contact="NewContacts";
    public static final String Column_Name= "name";
    public static final String Column_Email="Email";
    public static final String Column_PhoneNO="PhoneNo";

    public static void main(String[] args)
    {
         try
         {
//             Connection conn= DriverManager.getConnection(Connection_String);
//              Statement statement=conn.createStatement();
//                statement.execute(" DROP TABLE IF EXISTS " +Table_Contact);
//                statement.execute("CREATE TABLE IF NOT EXISTS " + Table_Contact + "(" + Column_Name + "TEXT,"
//                                                                                         + Column_Email + "TEXT,"
//                                                                                          + Column_PhoneNO + "INTEGER" + ")" );
//                statement.execute("INSERT INTO " +Table_Contact +"(" + Column_Name + ","
//                        + Column_Email + ","
//                        + Column_PhoneNO  +")" + "VALUES('karan','karan@gmail.com',985466)");
//
//             statement.execute(" INSERT INTO " +Table_Contact +"(" + Column_Name + ","
//                     + Column_Email + ","
//                     + Column_PhoneNO  +")" + " VALUES('karanbir','karangjhai@gmail.com',95685466) " );




             Connection conn= DriverManager.getConnection("jdbc:sqlite:"+ System.getProperty("user.dir")+"\\src\\SQLiteDatabase\\TestDB\\testjava.db");
             Statement statement=conn.createStatement();
             statement.execute("CREATE TABLE IF NOT EXISTS contacts (Name TEXT,Phone INTEGER,Email TEXT)");
             statement.execute("INSERT INTO contacts(Name,Phone,Email) VALUES('Karan',85345,'karan@gmail.com') ");
             statement.execute("INSERT INTO contacts(Name,Phone,Email) VALUES('JAI',854545,'karan1@gmail.com') ");
             statement.execute("INSERT INTO contacts(Name,Phone,Email) VALUES('Sodhi',853145,'karan2@gmail.com') ");
             statement.execute("INSERT INTO contacts(Name,Phone,Email) VALUES('Harman',5498645,'karan3@gmail.com') ");
             statement.execute("INSERT INTO contacts(Name,Phone,Email) VALUES('Anmol',5495645,'karan4@gmail.com') ");
//             statement.execute("UPDATE contacts SET Phone=981533 WHERE Name='Karan'");
//             statement.execute("INSERT TABLE IF NOT EXISTS asla (Name TEXT , PhneNo INTEGER)");
//             statement.execute("INSERT INTO asla(Name,PhneNo) VALUES('karan',89)");
//             statement.execute("DELETE FROM contacts WHERE Name= 'Anmol' ");
             statement.close();
             conn.close();
         }catch (SQLException e)
         {
             System.out.println("Something went wrong : "+e.getMessage());
         }

    }
}

