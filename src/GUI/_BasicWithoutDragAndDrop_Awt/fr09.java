package GUI._BasicWithoutDragAndDrop_Awt;

import java.awt.*;
import java.awt.event.*;

public class fr09 extends Frame implements ItemListener
{
    Checkbox c1,c2,c3;
    CheckboxGroup cbg;
    Button bt;

    fr09()
    {
        setLayout(null);

        cbg=new CheckboxGroup();

        c1=new Checkbox("RED",cbg,true);
        c2=new Checkbox("GREEN",cbg,false);
        c3=new Checkbox("BLUE",cbg,false);
        bt=new Button("This is Button");

        c1.setBounds(100,100,100,30);
        c2.setBounds(220,100,100,30);
        c3.setBounds(340,100,100,30);
        bt.setBounds(100,200,200,100);

        add(c1);
        add(c2);
        add(c3);
        add(bt);

        bt.setBackground(Color.RED);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        setTitle("Component Based GUI");
        setSize(600,400);
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource()==c1)
        {
            bt.setBackground(Color.RED);
        }
        else if(e.getSource()==c2)
        {
            bt.setBackground(Color.GREEN);
        }
        else if(e.getSource()==c3)
        {
            bt.setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args)
    {
        fr09 obj=new fr09();
    }
}

