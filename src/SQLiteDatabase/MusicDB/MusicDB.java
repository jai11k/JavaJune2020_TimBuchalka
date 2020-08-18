package SQLiteDatabase.MusicDB;

import SQLiteDatabase.MusicDB.model.DataSource;

public class MusicDB
{
    public static void main(String[] args) {
        DataSource dataSource= new DataSource();
        if(!dataSource.open())
        {
            System.out.println("Can't open database ");
        return;
        }
        dataSource.close();

    }
}
