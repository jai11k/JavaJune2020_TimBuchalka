package Thread.TimBuchalka.Thread_UsingThreadClass;

import static Thread.TimBuchalka.Thread_UsingThreadClass.ThreadColour.ANSI_Green;
import static Thread.TimBuchalka.Thread_UsingThreadClass.ThreadColour.ANSI_Red;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(ANSI_Red+"Hello from the Main thread....");

            Thread obj1=new AnotherThread();
            obj1.start();

            new Thread()
            {
                @Override
                public void run() {
                    System.out.println(ANSI_Green+"Hello from annonymus class....");
                }
            }.start();

        System.out.println("New hello from the main thread...");
    }
}
