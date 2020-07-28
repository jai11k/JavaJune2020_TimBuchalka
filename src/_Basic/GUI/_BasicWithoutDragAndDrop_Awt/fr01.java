package _Basic.GUI._BasicWithoutDragAndDrop_Awt;

import java.awt.*;

public class fr01 extends Frame
{
    fr01()
    {
        setTitle("This is First _Basic.GUI");
        setSize(600,600);
        setVisible(true);
    }
    @Override
    public void paint(Graphics g)
    {
        int x[]={150,220,170,430,350};
        int y[]={150,250,400,270,50};

        g.setColor(Color.RED);
        g.fillPolygon(x,y,5);
    }

    public static void main(String[] args)
    {
        fr01 obj=new fr01();
    }

}

