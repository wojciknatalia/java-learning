package Exercise2and3;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyPanel extends JPanel {

    int points;
    int cycles;

    public void setCycles(int newCycles){
        this.cycles=newCycles;
        repaint();
    }

    public void paintComponent(Graphics g){

        super.paintComponent(g); //clear prior images drawn in JPanel
        g.drawLine(0,250,700,250); // x-axis
        g.drawLine(350,0,350,700); // y-axis

        points=360*2;

        g.setColor(Color.red);

        for(double x=0; x<points; x=x+0.5)
        {
            double y = 100 * Math.sin(cycles*x*(Math.PI/180));
            int Y = (int)y;
            int X = (int)x;
            g.drawLine(X,250-Y,X,250-Y);
        }
    }

    MyPanel(){
        setCycles(3);
        Border blackline=BorderFactory.createLineBorder(Color.BLACK, 1);
        setBorder(blackline);
        setPreferredSize(new Dimension(700,500));
    }
}
