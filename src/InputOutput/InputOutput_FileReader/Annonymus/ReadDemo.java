package InputOutput.InputOutput_FileReader.Annonymus;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDemo
{
    public static void main(String[] args) throws IOException
    {
        int ch;

        FileReader fr=null;
        try{
            fr=new FileReader("text");
        }catch (FileNotFoundException e)
        {
            System.out.println("File not Found....");
        }

        while((ch=fr.read())!=-1)
        {
            System.out.println((char)ch);

        }

                  fr.close();

    }

}
