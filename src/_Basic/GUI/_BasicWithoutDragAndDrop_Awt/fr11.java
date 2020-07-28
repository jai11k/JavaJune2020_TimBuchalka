package _Basic.GUI._BasicWithoutDragAndDrop_Awt;

import java.awt.*;
import java.awt.event.*;

public class fr11 extends Frame implements ActionListener,ItemListener
{
    Choice lt;
    TextField tf;
    Button bt,bt2;
    Label lb;
        
    fr11()
    {
       setLayout(null);
        
       lt=new Choice();
       tf=new TextField();
       bt=new Button("ADD");
       bt2=new Button("Remove");
       lb=new Label("This is Label");

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
       
       setTitle("Component Based _Basic.GUI");
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
        String s=lt.getSelectedItem();
        
        lb.setText(s);
    }
    
    public static void main(String[] args)
    {
       fr11 obj=new fr11(); 
    }
}
