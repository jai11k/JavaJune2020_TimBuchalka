package InputOutput.FileReader.Annonymus;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDemo
{
    public static void main(String[] args) throws IOException
    {
        int ch;

        String currentDir = System.getProperty("user.dir");

        System.out.println(currentDir+"");
        System.out.println(currentDir+"/src/InputOutput/RequiredTextFiles/");

        String path=currentDir+"/src/InputOutput/RequiredTextFiles/";

//        FileReader fr=new FileReader(path+"file.txt");
        FileReader fr=null;
        try
        {
        fr=new FileReader(path+"output.txt");
        }
        catch (FileNotFoundException e)
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
