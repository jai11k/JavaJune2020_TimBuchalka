package _Basic.ArrayList;

import java.util.ArrayList;

public class DemoArraylistClass
{
    public static void main(String[] args)
    {
        ArrayList<Integer> aray=new ArrayList<>();

        aray.add(45);
        aray.add(55);
        aray.add(7);
        aray.add(6);
        System.out.println(aray.get(3));
        aray.set(1,69);
        System.out.println(aray);
        aray.clear();
    }
}
