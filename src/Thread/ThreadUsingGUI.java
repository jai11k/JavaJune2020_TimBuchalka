package Thread;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class ThreadUsingGUI extends Frame implements ActionListener
{
    Button b1,b2;
    Label l1,l2;
    public ThreadUsingGUI()
    {
          b1=new Button("Add");
          b2=new Button("CLick");
          l1=new Label("Label1");
          l2=new Label("Label2");


          add(b1);
          add(b2);
          add(l2);
          add(l1);


        setTitle("Thread Using GUI");
        setSize(600,600);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {



    }

    public static void main(String[] args)
    {
        ThreadUsingGUI obj1=new ThreadUsingGUI();
    }
}
