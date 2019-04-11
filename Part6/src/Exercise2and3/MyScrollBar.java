package Exercise2and3;

import javax.swing.*;
import java.awt.*;

public class MyScrollBar extends JScrollBar {

    MyScrollBar(int orient, int val, int step, int min, int max){
        super(orient, val, step, min, max);
        setPreferredSize(new Dimension(700,15));
    }
}
