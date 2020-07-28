package _Basic.GUI._BasicWithoutDragAndDrop_Awt;

import java.awt.*;
import java.awt.event.*;

public class fr15 extends Frame implements MouseMotionListener
{
    Label lb,lb2;
        
    fr15()
    {
       setLayout(null);
  
       lb=new Label("this is a label");      
       lb2=new Label("this is Label 2");
       
       lb.setBounds(100,100,200,25);
       lb2.setBounds(100,200,200,25);
       
       add(lb);
       add(lb2);
       
       this.addMouseMotionListener(this);
       
       setTitle("Component Based _Basic.GUI");
       setSize(1000,600);
       setVisible(true);      
    } 
    
    public static void main(String[] args)
    {
       fr15 obj=new fr15(); 
    }
    
    @Override
    public void mouseMoved(MouseEvent e)
    {
        lb.setText(e.getX()+ ","+ e.getY());
    }
    
    @Override
    public void mouseDragged(MouseEvent e)
    {
        lb2.setText(e.getX()+ ","+ e.getY());
    }
}
