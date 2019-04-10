package Exercise2;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyPanel extends JPanel {

    public void paintComponent(Graphics g){

        g.drawLine(0,250,700,250); // x-axis
        g.drawLine(350,0,350,700); // y-axis

        g.setColor(Color.red);

        for(double x=-350;x<=350;x=x+0.5)
        {
            double y = 100 * Math.sin(x*(Math.PI/180));
            int Y = (int)y;
            int X = (int)x;
            g.drawLine(350+X,250-Y,350+X,250-Y);
        }
    }

    MyPanel(){
        Border blackline=BorderFactory.createLineBorder(Color.BLACK, 1);
        setBorder(blackline);
        setPreferredSize(new Dimension(700,500));
    }
}
