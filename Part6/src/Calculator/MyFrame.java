package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame{

    private JTextArea textArea1;

    MyFrame(){
        JFrame frame=new JFrame("Calculator");
        frame.setLayout(new FlowLayout());
        frame.setPreferredSize(new Dimension(300, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        textArea1=new JTextArea("Tutaj będzie wyświetlał się wynik");
        textArea1.setEditable(false);
        textArea1.setPreferredSize(new Dimension(250,40));
        frame.add(textArea1);

        ButtonPanel panel=new ButtonPanel(textArea1);
        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){
        new MyFrame();
    }
}
