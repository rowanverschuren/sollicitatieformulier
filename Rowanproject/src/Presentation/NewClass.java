/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

/**
 *
 * @author rowan
 */

    

import java.awt.GridLayout;
import javax.swing.*;

class NewClass {

public static void main(String[] args) {
    
    JFrame frame = new JFrame();
    frame.setSize (400, 600);
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.setTitle ("Sollicitatie formulier");
    frame.setContentPane(new Formpaneel());
    frame.setVisible (true);
    
    
    String[] items = {"One", "Two", "Three", "Four", "Five"};
    JComboBox combo = new JComboBox(items);
    JTextField field1 = new JTextField("1234.56");
    JTextField field2 = new JTextField("9876.54");
    JPanel panel = new JPanel(new GridLayout(0, 1));
    panel.add(combo);
    panel.add(new JLabel("Field 1:"));
    panel.add(field1);
    panel.add(new JLabel("Field 2:"));
    panel.add(field2);
   
}
}