package InputOutput.FileWritter.Annonymus;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFileDemo
{
    public static void main(String[] args) throws IOException
    {
        String sr="File Handling in Java " + "using File Writter..";
        FileWriter fw=new FileWriter(System.getProperty("user.dir")+"/src/InputOutput/RequiredTextFiles/output.txt");

    for (int i = 0; i <sr.length() ; i++)
    {
        fw.write(sr.charAt(i));
    }

        fw.close();
    }
}
