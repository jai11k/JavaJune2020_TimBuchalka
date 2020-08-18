package SQLiteDatabase.MusicDB.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class DataSource
{
    public static final String DB_Name = " music.db";
    public static final String Connection_String = "jdbc:sqlite:C:\\Users\\karan\\IdeaProjects\\JavaJune2020_TimBuchalka\\src\\SQLiteDatabase\\MusicDB\\ " + DB_Name;
    public static final String Table_Albums = "albums";
    public static final String Column_Albums_ID = "_id";
    public static final String Column_Albums_Name = "_Name";
    public static final String Column_Albums_Artist = "_artist";

    public static final String Table_Artist = "artist";
    public static final String Artist_Name = "_name";
    public static final String Artist_ID = "_id";

    public static final String Table_Songs = "songs";
    public static final String Songs_Track = "_track";
    public static final String Songs_Album = "_album";
    public static final String Songs_Title = "_title";

    private Connection conn;

    public boolean open()
    {
        try {
            conn= DriverManager.getConnection(Connection_String);
            return true;
        }catch (SQLException e )
        {
            System.out.println("Could'nt connected to the database : "+e.getMessage());
            return false;
        }
    }
        public void close()
        {
            try {
                if (conn != null) {
                    conn.close();
                }
            }catch(SQLException e )
            {
                System.out.println("Could'nt get closed "+ e.getMessage());
            }



        }
}