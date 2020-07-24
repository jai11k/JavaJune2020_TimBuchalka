package GUI._BasicWithoutDragAndDrop_Awt;


import java.awt.*;
import java.awt.event.*;

public class fr07 extends Frame implements ActionListener,TextListener
{
    TextField tf1,tf2;
    Button bt;

    fr07()
    {
        setLayout(null);

        tf1=new TextField(20);
        tf2=new TextField(20);
        bt=new Button("Button 1");

        tf1.setBounds(100,100,150,25);
        tf2.setBounds(100,150,150,25);
        bt.setBounds(300,100,150,40);

        add(tf1);
        add(tf2);
        add(bt);

        //Register ActionListener with Button
        bt.addActionListener(this);
        //Regsiter TextListener with TextField
        tf1.addTextListener(this);

        bt.setBackground(Color.YELLOW);
        bt.setForeground(Color.BLUE);

        bt.setEnabled(false);

        setTitle("Component Based GUI");
        setSize(600,400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        tf2.setText("Button was Clicked");
    }

    @Override
    public void textValueChanged(TextEvent e)
    {
        tf2.setText(tf1.getText());
    }

    public static void main(String[] args)
    {
        fr07 obj=new fr07();
    }
}
