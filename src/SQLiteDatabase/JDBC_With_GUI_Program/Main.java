package SQLiteDatabase.JDBC_With_GUI_Program;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class Main extends JFrame implements ActionListener {

    ArrayList<SQLiteDatabase.Music_DB.Artist> al;
    mytablemodel tm;
    JScrollPane jsp;
    JTable jt;


    JProgressBar progressBar;
    JButton bt1, bt2, bt3;

    Main() {


        progressBar = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);
        progressBar.setBackground(Color.WHITE);
        progressBar.setForeground(Color.GREEN);
        progressBar.setStringPainted(true);

        setLayout(null);
        tm = new mytablemodel();
        al = new ArrayList<>();


        jt = new JTable();
        bt1 = new JButton("List Artists");
        bt2 = new JButton("Show Albums (artists)");
        bt3 = new JButton("Update Artits");

        jt.setModel(tm);

        jsp = new JScrollPane();
        jsp.setViewportView(jt);

        jsp.setBounds(50, 50, 500, 500);
        progressBar.setBounds(400, 650, 250, 20);
        bt1.setBounds(765, 400, 165, 25);
        bt2.setBounds(765, 435, 165, 25);
        bt3.setBounds(765, 470, 165, 25);


        add(progressBar);
        add(bt1);
        add(bt2);
        add(bt3);
        add(jsp);

        //Register ActionListener with Button
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);


        setTitle("Music Database");
        setSize(1000, 800);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        //Logic to move pbar
//        for(int i=1;i<=100;i++)
//        {
//            progressBar.setValue(i);
//            progressBar.setString(i+"% Complete");
//            try
//            {
//                Thread.sleep(100);
//            }
//            catch(Exception ex)
//            {
//                ex.printStackTrace();
//            }
//        }
    }


    ///// Inner Class ///////////////////
    class mytablemodel extends AbstractTableModel {
        String col[] = {"Id", "Name"};

        @Override
        public int getRowCount() {
            return al.size();
        }

        @Override
        public int getColumnCount() {
            return col.length;
        }

        @Override
        public String getColumnName(int pos) {

            return col[pos];
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            SQLiteDatabase.Music_DB.Artist st = al.get(rowIndex);

            if (columnIndex == 0)
                return st.getId();
            else if (columnIndex == 1)
                return st.getName();


            return "anything";
        }
    }
    /////////////////////////////////////


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt1) {
            al.clear();
            DataSource dataSource = new DataSource();

            if (!dataSource.open()) {
                System.out.println("Can't open datasource");
                return;
            }


            List<SQLiteDatabase.Music_DB.Artist> artists = dataSource.queryArtists(5);
            al = (ArrayList) artists;

            tm.fireTableDataChanged();


            //db l connrct kt k data fetch kt k table ch show krna
        } else if (e.getSource() == bt2)
        {


            }
//        } else if (e.getSource() == bt3) {
//
//        }
    }
}



//region
/*
sfhjfewhgewjglv
 */
//endregion