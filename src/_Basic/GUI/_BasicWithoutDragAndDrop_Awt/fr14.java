package _Basic.GUI._BasicWithoutDragAndDrop_Awt;

import java.awt.*;
import java.awt.event.*;

public class fr14 extends Frame implements MouseListener
{
    Button bt;
    Label lb;
        
    fr14()
    {
       setLayout(null);
  
       bt=new Button("0");
       lb=new Label("this is a label");
       
       bt.setFont(new Font("arial", Font.BOLD, 20));
       
       bt.setBounds(100,100,300,300);
       lb.setBounds(100,450,200,30);
       
       add(bt);
       add(lb);
       
       bt.addMouseListener(this);
       
       setTitle("Component Based _Basic.GUI");
       setSize(600,700);
       setVisible(true);      
    } 
    
    public static void main(String[] args)
    {
       fr14 obj=new fr14(); 
    }
    
    @Override
    public void mouseClicked(MouseEvent e)
    {
         int n=Integer.parseInt(bt.getLabel());
         n++;
         bt.setLabel(n+"");
    }
    
    @Override
    public void mousePressed(MouseEvent e)
    {
      lb.setText("Mouse Pressed");
    }
    
    @Override
    public void mouseReleased(MouseEvent e)
    {
      lb.setText("Mouse Released");
    }
    
    @Override
    public void mouseEntered(MouseEvent e)
    {
       bt.setBackground(Color.GREEN);               
    }
    
    @Override
    public void mouseExited(MouseEvent e)
    {
       bt.setBackground(Color.YELLOW);
    }
}
