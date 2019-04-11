package Exercise2and3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class MyFrame extends JFrame {

    JMenu menu, submenu;
    JMenuItem iAbout, iClose;
    JMenuBar mb;

    MyFrame(){

        JFrame frame=new JFrame("Window App from Part6");
        frame.setLayout(new FlowLayout()); //innaczej nie będzie działał size panelu

        mb=new JMenuBar();
        menu=new JMenu("Menu");
        submenu=new JMenu("Opcje");
        iAbout=new JMenuItem("O programie");
        iClose=new JMenuItem("Zamknij");

        //obsługa zdarzeń - kliknięcia
        iClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        iAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame littleFrame=new JFrame("O programie");
                JTextArea tA=new JTextArea("Tutaj znajdują się informacje o programie");
                tA.setEditable(false);
                littleFrame.add(tA);
                littleFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                littleFrame.setPreferredSize(new Dimension(300,200));
                littleFrame.pack();
                littleFrame.setVisible(true);
            }
        });

        menu.add(iAbout);
        submenu.add(iClose);
        menu.add(submenu);
        mb.add(menu);

        frame.setJMenuBar(mb);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(700,700));

        //dodanie panelu
        MyPanel panel=new MyPanel();

        //dodanie scrollbaru
        MyScrollBar scrollBar=new MyScrollBar(JScrollBar.HORIZONTAL, 2, 1, 1,10);
        scrollBar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                panel.setCycles(e.getValue());
            }
        });

        frame.add(panel);
        frame.add(scrollBar);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){
        new MyFrame();
    }
}
