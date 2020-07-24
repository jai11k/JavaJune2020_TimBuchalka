package GUI._BasicWithoutDragAndDrop_Awt;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fr05 extends Frame implements ActionListener
{
    TextField tf1,tf2;
    Button bt,bt2;

    fr05()
    {
        setLayout(new FlowLayout());

        tf1=new TextField(20);
        tf2=new TextField(20);
        bt=new Button("Button 1");
        bt2=new Button("Button 2");

        add(tf1);
        add(tf2);
        add(bt);
        add(bt2);

        //Register ActionListener with Button
        bt.addActionListener(this);
        bt2.addActionListener(this);

        setTitle("Component Based GUI");
        setSize(600,400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()== bt)
        {
            String s=tf1.getText();
            tf2.setText(s);
        }
        else if(e.getSource()==bt2)
        {
            tf1.setText(Math.random()+"");
        }
    }

    public static void main(String[] args)
    {
        fr05 obj=new fr05();
    }
}

