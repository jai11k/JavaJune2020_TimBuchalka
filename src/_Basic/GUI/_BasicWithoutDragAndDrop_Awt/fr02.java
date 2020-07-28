package _Basic.GUI._BasicWithoutDragAndDrop_Awt;

import java.awt.*;

public class fr02 extends Frame
{
    TextField tf;
    TextField tf2;
    Button bt;

    fr02()
    {
        setLayout(new FlowLayout());

        tf=new TextField(20);
        tf2=new TextField(20);
        bt=new Button("This is Button");

        add(tf);
        add(tf2);
        add(bt);

        setTitle("Component Based _Basic.GUI");
        setSize(600,600);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        fr02 obj=new fr02();
    }
}