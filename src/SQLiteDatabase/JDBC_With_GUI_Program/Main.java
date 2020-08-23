package SQLiteDatabase.JDBC_With_GUI_Program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame implements ActionListener, stop {

    @Override
    protected void frameInit() {
        super.frameInit();
        Datasource.getInstance().open();
    }


    public void frameStop()
    {
        Datasource.getInstance().close();
    }

    //  JTable table;
    JProgressBar progressBar;
    JButton bt1,bt2,bt3;

    Main()
    {
        setLayout(null);
        setTitle("Music Database");
        setSize(1000,800);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);



//        table=new JTable();
//
        progressBar = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);
        progressBar.setBackground(Color.WHITE);
        progressBar.setForeground(Color.GREEN);
        progressBar.setStringPainted(true);

        bt1=new JButton("List Artists");
        bt2=new JButton("Show Albums (artists)");
        bt3=new JButton("Update Artits");

//        table.setBounds(20,20,550,550);
        progressBar.setBounds(400,650,250,20);
        bt1.setBounds(765,400,165,25);
        bt2.setBounds(765,435,165,25);
        bt3.setBounds(765,470,165,25);


//        add(table);
        add(progressBar);
        add(bt1);
        add(bt2);
        add(bt3);

        //Register ActionListener with Button
        bt1.addActionListener(this);
        bt2.addActionListener(this);
           //Logic to move pbar
        for(int i=1;i<=100;i++)
        {
            progressBar.setValue(i);
            progressBar.setString(i+"% Complete");
            try
            {
                Thread.sleep(100);
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }



    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==bt1)
        {
            JOptionPane.showMessageDialog(rootPane, "Enter Cost Price");
        }
    }


}
//region
/*
sfhjfewhgewjglv
 */
//endregion