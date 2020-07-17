package GUI._BasicWithoutDragAndDrop_Awt;

import java.awt.*;
import java.awt.event.*;

public class fr13 extends Frame implements FocusListener
{
    TextField tf1,tf2,tf3;  
        
    fr13()
    {
       setLayout(null);
        
       tf1=new TextField();
       tf2=new TextField();
       tf3=new TextField();
      
       tf1.setBounds(100,100,150,25);
       tf2.setBounds(100,150,150,25);
       tf3.setBounds(100,200,150,25);

       add(tf1);
       add(tf2);
       add(tf3);
       
       tf1.addFocusListener(this);
       tf2.addFocusListener(this);
       tf3.addFocusListener(this);
       
       setTitle("Component Based GUI");
       setSize(600,400);
       setVisible(true);      
    }
    
    @Override
    public void focusGained(FocusEvent e)
    {
       Component ct=(Component)(e.getSource());
       ct.setBackground(Color.YELLOW);
    }
    
    @Override
    public void focusLost(FocusEvent e)
    {
        if(e.getSource()==tf1)
       {
           tf1.setBackground(Color.WHITE);
       }
       else if(e.getSource()==tf2)
       {
           tf2.setBackground(Color.WHITE);
       }
       else if(e.getSource()==tf3)
       {
           tf3.setBackground(Color.WHITE);
       }
    }
        
    
    
    
    public static void main(String[] args)
    {
       fr13 obj=new fr13(); 
    }
}
