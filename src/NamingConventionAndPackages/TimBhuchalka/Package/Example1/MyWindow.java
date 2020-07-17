package NamingConventionAndPackages.TimBhuchalka.Package.Example1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame
{
    public MyWindow(String title)
    {
        super(title);
        setSize(500, 120);
        addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosed(WindowEvent e) {
              System.exit(0);
            }
        });
    }

        @Override
        public void paint (Graphics g)
        {
            super.paint(g);
            Font sansSerifLarge = new Font("sansSerif", Font.BOLD, 18);
            Font sansSerifSmall = new Font("sansSerif", Font.BOLD, 12);
            g.setFont(sansSerifLarge);
            g.drawString("The Compplete Java Course", 60, 50);
            g.setFont(sansSerifSmall);
            g.drawString("By Karanbir Singh", 40, 20);
        }
    }
