package GUI._BasicWithoutDragAndDrop_Awt;

import java.awt.*;

public class fr02 extends Frame
{
    TextField tf;
    Button bt;

    fr02()
    {
        setLayout(new FlowLayout());

        tf=new TextField(20);
        bt=new Button("This is Button");

        add(tf);
        add(bt);

        setTitle("Component Based GUI");
        setSize(600,600);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        fr02 obj=new fr02();
    }
}