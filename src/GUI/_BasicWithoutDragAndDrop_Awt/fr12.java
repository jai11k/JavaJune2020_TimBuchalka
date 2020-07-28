package GUI._BasicWithoutDragAndDrop_Awt;

import java.awt.*;
import java.awt.event.*;

public class fr12 extends Frame implements WindowListener
{
    TextField tf;
    Button bt;
        
    fr12()
    {
       setLayout(null);
        
       tf=new TextField();
       bt=new Button();
       
       tf.setBounds(100,100,150,25);
       bt.setBounds(100,200,150,50);
       
       add(tf);
       add(bt);
       
       this.addWindowListener(this);
       
       setTitle("Component Based GUI");
       setSize(600,400);
       setVisible(true);      
    }
        
    public static void main(String[] args)
    {
       fr12 obj=new fr12(); 
    }
    
    @Override
    public void windowOpened(WindowEvent e)
    {
        System.out.println("Window Opened");
    }
    
    @Override
    public void windowClosing(WindowEvent e)
    {
       dispose();
    }
    
    @Override
    public void windowClosed(WindowEvent e)
    {
        System.out.println("window closed");
    }
    
    @Override
    public void windowIconified(WindowEvent e)
    {
         setTitle("Window Iconified");
    }
    
    @Override
    public void windowDeiconified(WindowEvent e)
    {
        setTitle("Window DE-ICONIFIED");
    }
    
    @Override
    public void windowActivated(WindowEvent e)
    {
        setBackground(Color.YELLOW);
    }
    
    @Override
    public void windowDeactivated(WindowEvent e)
    {
        setBackground(Color.RED);
    }   
}
