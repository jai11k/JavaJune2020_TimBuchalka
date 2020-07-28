package Thread.TimBuchalka.Thread_UsingThreadClass;

import static Thread.TimBuchalka.Thread_UsingThreadClass.ThreadColour.ANSI_Black;
import static Thread.TimBuchalka.Thread_UsingThreadClass.ThreadColour.ANSI_Green;

public class AnotherThread extends Thread
{
    @Override
    public void run() {
        System.out.println( ANSI_Black+ "Hello from another thread..!!!");


    }
}
