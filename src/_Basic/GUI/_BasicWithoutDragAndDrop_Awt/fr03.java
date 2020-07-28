package _Basic.GUI._BasicWithoutDragAndDrop_Awt;


import java.awt.*;
import java.awt.event.*;

public class fr03 extends Frame  implements ActionListener
{
    TextField tf;
    Button bt;

    fr03()
    {
        setLayout(new FlowLayout());

        tf=new TextField(20);
        bt=new Button("This is Button");

        add(tf);
        add(bt);

        //Register ActionListener with Button
        bt.addActionListener(this);


        setTitle("Component Based _Basic.GUI");
        setSize(600,400);
        setVisible(true);
    }


    public static void main(String[] args)
    {
        fr03 obj=new fr03();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        tf.setText(Math.random()+"");
    }
}
