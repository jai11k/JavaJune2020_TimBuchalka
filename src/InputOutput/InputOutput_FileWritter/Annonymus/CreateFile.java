package InputOutput.InputOutput_FileWritter.Annonymus;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile
{
    public static void main(String[] args) throws IOException {
        String sr="File Handling in Java " + "using File Writter..";
        FileWriter fw=new FileWriter("output.txt");


        for (int i = 0; i <sr.length() ; i++)
        {
            fw.write(sr.charAt(i));
        }
        fw.close();
    }
}
