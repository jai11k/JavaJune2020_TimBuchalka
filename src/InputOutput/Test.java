package InputOutput;

import java.io.File;

public class Test
{
    public static void main(String[] args)
    {

    }


}

class SystemUnderTest
{
    public SystemUnderTest()
    {
        String currentDir = System.getProperty("user.dir");
        System.out.println(currentDir+"");
        System.out.println(currentDir+"/src/InputOutput/");

//        ClassLoader classLoader = getClass().getClassLoader();
//        File fi = new File(classLoader.getResource("test.txt").getFile());

//        String file = getClass().getClassLoader().getResource("application.yaml").getPath();

    }
}
