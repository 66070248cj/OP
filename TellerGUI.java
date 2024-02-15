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
public class TellerGUI {
    private JFrame f;
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JTextField tf;
    private JLabel lb1;
    private JLabel lb2;
    private JLabel lb3;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    
    public TellerGUI(){
        f = new JFrame("Teller GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        tf = new JTextField();
        lb1 = new JLabel("Balance");
        lb2 = new JLabel("Amount");
        lb3 = new JLabel("6000");
        b1 = new JButton("Deposit");
        b2 = new JButton("Withdraw");
        b3 = new JButton("Exit");
        
        p1.setLayout(new GridLayout(1, 2));
        p1.add(lb1);
        p1.add(lb3);
        
        p2.setLayout(new GridLayout(1, 2));
        p2.add(lb2);
        p2.add(tf);
        
        //button
        p3.setLayout(new FlowLayout());
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);
        
        //f.add(p1, BorderLayout.NORTH);
        //f.add(p2, BorderLayout.CENTER);
        
        f.setLayout(new GridLayout(3, 1));
        f.add(p1);
        f.add(p2);
        f.add(p3);
        
        f.pack();
        f.setSize(300, 200);
        f.setVisible(true);
        
        
    }
    public static void main(String[] args) {
        new TellerGUI();
    }
    
}
