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
public class CalculatorOneGUI {
    private JFrame f;
    private JPanel p;
    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;
    
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    
    public CalculatorOneGUI(){
        f = new JFrame();
        p = new JPanel();
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        b1 = new JButton("+");
        b2 = new JButton("-");
        b3 = new JButton("x");
        b4 = new JButton("/");
        
        f.setLayout(new GridLayout(4, 1));
        f.add(tf1);
        f.add(tf2);
        f.add(p);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        f.add(tf3);
       


        f.pack();
        f.setSize(400, 200);
        f.setVisible(true);
         
    }
    public static void main(String[] args) {
            new CalculatorOneGUI();
        }
}
