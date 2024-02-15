/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import javax.swing.*;
import java.awt.*;
public class CalculatorTwoGUI {
    private JFrame f;
    private JPanel p;
    private JTextField tf;

    private JButton b0;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton b10;
    private JButton b11;
    private JButton b12;
    private JButton b13;
    private JButton b14;
    private JButton b15;
    
    
    public CalculatorTwoGUI(){
        f = new JFrame("My Calculator");
        p = new JPanel();
        tf = new JTextField();
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b10 = new JButton("+");
        b11 = new JButton("-");
        b12 = new JButton("x");
        b13 = new JButton("/");
        b14 = new JButton("c");
        b15 = new JButton("=");

        
        //button
        p.setLayout(new GridLayout(4, 4));
        p.add(b7); p.add(b8); p.add(b9); p.add(b10);
        p.add(b4); p.add(b5); p.add(b6); p.add(b11);
        p.add(b1); p.add(b2); p.add(b3); p.add(b12);
        p.add(b0); p.add(b14); p.add(b15); p.add(b13);
                     
        f.add(tf, BorderLayout.NORTH);
        f.add(p, BorderLayout.CENTER);
        
        
        f.pack();
        f.setSize(400, 400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new CalculatorTwoGUI();
 }
}
