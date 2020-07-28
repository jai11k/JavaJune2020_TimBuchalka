package Thread.Vmm;

public class ThreadUsingSleep {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }catch (Exception e )
            {
                e.printStackTrace();
            }
        }
    }
}




//Thread.sleep(time)  is used in try catch method .It has exception.It is compulsary to put Threaad.sleep in try catch.