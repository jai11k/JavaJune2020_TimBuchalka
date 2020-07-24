package GUI._BasicWithoutDragAndDrop_Awt;


import java.awt.*;
import java.awt.event.*;

public class fr10 extends Frame implements ActionListener,ItemListener
{
    List lt;
    TextField tf;
    Button bt,bt2;
    Label lb;

    fr10()
    {
        setLayout(null);

        lt=new List();
        tf=new TextField();
        bt=new Button("ADD");
        bt2=new Button("Remove");
        lb=new Label("This is Label");

        //Enable Mutli Selection
        lt.setMultipleMode(true);

        lt.setBounds(100,150,150,100);
        tf.setBounds(100,100,150,25);
        bt.setBounds(270,100,150,25);
        bt2.setBounds(270,150,150,25);
        lb.setBounds(100,400,200,30);

        add(lt);
        add(tf);
        add(bt);
        add(bt2);
        add(lb);

        bt.addActionListener(this);
        bt2.addActionListener(this);
        lt.addItemListener(this);

        setTitle("Component Based GUI");
        setSize(600,400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==bt)  //ADD
        {
            String p=tf.getText();
            lt.add(p);
            tf.setText("");
            tf.requestFocus();
        }
        else if(e.getSource()==bt2)   //Remove
        {
            int pos=lt.getSelectedIndex();
            if(pos!=-1)
            {
                lt.remove(pos);
                lb.setText("");
            }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e)
    {
        String a[]=lt.getSelectedItems();
        String ans="Selected Items ";

        for(int i=0;i<a.length;i++)
        {
            ans = ans + a[i]+", ";
        }

        lb.setText(ans);
    }

    public static void main(String[] args)
    {
        fr10 obj=new fr10();
    }
}
