package Exercise2AnotherWay;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyPanel extends JPanel {

    private static final int scale = 200;
    int cycles;
    int points;
    double[] sines;
    int[] pts;

    public void setCycles(int newCycles){
        cycles=newCycles;
        points=scale*cycles*2;
        sines=new double[points];
        for(int i=0; i<points; i++){
            double radians=(Math.PI/scale)*i;
            sines[i]=Math.sin(radians);
        }
        repaint();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.drawLine(0,250,700,250); // x-axis
        g.drawLine(350,0,350,700); // y-axis

        int maxWidth=getWidth();
        double hstep=(double)maxWidth/(double)points;
        int maxHeight=getHeight();
        pts=new int[points];
        for(int i=0; i<points; i++)
            pts[i]=(int)(sines[i] * maxHeight / 2 * .95 + maxHeight / 2);
        g.setColor(Color.MAGENTA);
        for(int i=1; i<points; i++){
            int x1=(int)((i-1)*hstep);
            int x2=(int)(i*hstep);
            int y1=pts[i-1];
            int y2=pts[i];
            g.drawLine(x1,y1,x2,y2);
        }
    }


    MyPanel(){
        Border blackline=BorderFactory.createLineBorder(Color.BLACK, 1);
        setBorder(blackline);
        setCycles(5);
        setPreferredSize(new Dimension(700,500));
    }
}
