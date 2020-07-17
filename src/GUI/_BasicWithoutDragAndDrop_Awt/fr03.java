package GUI._BasicWithoutDragAndDrop_Awt;


import java.awt.*;
import java.awt.event.*;

public class fr03 extends Frame implements ActionListener
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

        setTitle("Component Based GUI");
        setSize(600,400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        //Logic
        tf.setText(Math.random()+"");
    }

    public static void main(String[] args)
    {
        fr03 obj=new fr03();
    }
}
