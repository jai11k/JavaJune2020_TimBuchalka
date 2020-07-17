package GUI._BasicWithoutDragAndDrop_Awt;

import java.awt.*;
import java.awt.event.*;

public class fr08 extends Frame implements ItemListener
{
    Checkbox c1;
    Label lb;

    fr08()
    {
        setLayout(null);

        c1=new Checkbox("Show");
        lb=new Label("This is Label");

        c1.setBounds(100,100,200,30);
        lb.setBounds(100,150,200,30);

        add(c1);
        add(lb);

        lb.setVisible(false);

        c1.addItemListener(this);

        setTitle("Component Based GUI");
        setSize(600,400);
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e)
    {
        if(c1.getState()==true)
        {
            lb.setVisible(true);
        }
        else
        {
            lb.setVisible(false);
        }
    }

    public static void main(String[] args)
    {
        fr08 obj=new fr08();
    }
}
