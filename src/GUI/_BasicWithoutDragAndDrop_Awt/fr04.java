package GUI._BasicWithoutDragAndDrop_Awt;

import java.awt.*;
import java.awt.event.*;

public class fr04 extends Frame implements ActionListener
{
    TextField tf1,tf2;
    Label lb;
    Button bt;

    fr04()
    {
        setLayout(new FlowLayout());

        tf1=new TextField(20);
        tf2=new TextField(20);
        lb=new Label("   This is a Label    ");
        bt=new Button("ADD");

        add(tf1);
        add(tf2);
        add(bt);
        add(lb);

        //Register ActionListener with Button
        bt.addActionListener(this);

        setTitle("Component Based GUI");
        setSize(790,400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

        if(tf1.getText().isEmpty() || tf2.getText().isEmpty())
        {
            lb.setText("no. ta enter kr.");
        }

        //Logic
        int a,b,c;
        a = Integer.parseInt(tf1.getText());
        b = Integer.parseInt(tf2.getText());

        c=a+b;

        lb.setText("Sum is "+c);
    }

    public static void main(String[] args)
    {
        fr04 obj=new fr04();
    }
}
