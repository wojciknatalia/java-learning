package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonPanel extends JPanel implements ActionListener {
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton b0;
    private JButton bdiv;
    private JButton bmul;
    private JButton badd;
    private JButton bsub;
    private JButton bdot;
    private JButton beq;
    JTextArea textArea;
    String s0, s1, s2;

    ButtonPanel(JTextArea textArea){
        s0=s1=s2=""; //left side, operand, right side
        this.textArea=textArea;

        add(textArea);
        setPreferredSize(new Dimension(300, 400));
        setBackground(Color.lightGray);

        Box first=Box.createHorizontalBox();
        Box sedond=Box.createHorizontalBox();
        Box third=Box.createHorizontalBox();
        Box fourth=Box.createHorizontalBox();

        b1=new JButton("1");
        first.add(b1);
        first.add(Box.createRigidArea(new Dimension(10,0)));
        b2=new JButton("2");
        first.add(b2);
        first.add(Box.createRigidArea(new Dimension(10,0)));
        b3=new JButton("3");
        first.add(b3);
        first.add(Box.createRigidArea(new Dimension(10,0)));
        badd= new JButton("*");
        first.add(badd);

        b4=new JButton("4");
        sedond.add(b4);
        sedond.add(Box.createRigidArea(new Dimension(10,0)));
        b5=new JButton("5");
        sedond.add(b5);
        sedond.add(Box.createRigidArea(new Dimension(10,0)));
        b6=new JButton("6");
        sedond.add(b6);
        sedond.add(Box.createRigidArea(new Dimension(10,0)));
        bsub= new JButton("-");
        sedond.add(bsub);

        b7=new JButton("7");
        third.add(b7);
        third.add(Box.createRigidArea(new Dimension(10,0)));
        b8=new JButton("8");
        third.add(b8);
        third.add(Box.createRigidArea(new Dimension(10,0)));
        b9=new JButton("9");
        third.add(b9);
        third.add(Box.createRigidArea(new Dimension(10,0)));
        bmul= new JButton("*");
        third.add(bmul);

        b0=new JButton("0");
        fourth.add(b0);
        fourth.add(Box.createRigidArea(new Dimension(10,0)));
        bdot=new JButton(".");
        fourth.add(bdot);
        fourth.add(Box.createRigidArea(new Dimension(10,0)));
        beq=new JButton("=");
        fourth.add(beq);
        fourth.add(Box.createRigidArea(new Dimension(10,0)));
        bdiv=new JButton("/");
        fourth.add(bdiv);

        add(first);
        add(sedond);
        add(third);
        add(fourth);
    }

    public void actionPerformed(ActionEvent e){
        String s=e.getActionCommand();

        //if the val is num
        if((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0)=='.'){
            if(!s1.equals(""))
                s2=s2+s;
            else
                s0=s0+s;

            textArea.setText(s0+s1+s2);
        }
        else if(s.charAt(0)=='='){
            double res;

            if(s1.equals("+"))
                res=(Double.parseDouble(s0)+Double.parseDouble(s2));
            else if(s1.equals("-"))
                res=(Double.parseDouble(s0)-Double.parseDouble(s2));
            else if(s1.equals("/"))
                res=(Double.parseDouble(s0)/Double.parseDouble(s2));
            else
                res=(Double.parseDouble(s0)*Double.parseDouble(s2));

            textArea.setText(s0+s1+s2+"="+res);

            s0=Double.toString(res);
            s1 = s2 = ""; //end of "loop"
        }

    }
}
