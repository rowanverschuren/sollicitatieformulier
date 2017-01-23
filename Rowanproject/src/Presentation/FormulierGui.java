/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template , choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import datastorage.connection;
import datastorage.FormulierDAO;


import javax.swing.*; 
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

/**
 *
 * @author rowan
 */
public class FormulierGui extends JFrame {
    public static void main (String args[]) {
    
    JFrame frame = new JFrame();
    frame.setSize (400, 400);
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.setTitle ("Sollicitatie formulier");
    frame.setContentPane( new SollicitatiePaneel ());
    frame.setVisible (true);
    
    }
}

class SollicitatiePaneel extends JPanel {
    private JTextField IdField, NaamField, SoortField, DatumField, ReactieField, CommentaarField;
    private JLabel IdLabel, NaamLabel, SoortLabel, DatumLabel, ReactieLabel, CommentaarLabel;
    
    
    //disables flowlayout 
    public SollicitatiePaneel(){
        setLayout (null);
        
        //sets layout
        
        IdField = new JTextField (20);
        IdField.setHorizontalAlignment ( JTextField.RIGHT);
       
        NaamField = new JTextField (20);
        NaamField.setHorizontalAlignment (JTextField.RIGHT);
        
        SoortField = new JTextField (20);
        SoortField.setHorizontalAlignment (JTextField.RIGHT);
        
        DatumField = new JTextField (20);
        DatumField.setHorizontalAlignment (JTextField.RIGHT);
        
        ReactieField = new JTextField (20);
        ReactieField.setHorizontalAlignment (JTextField.RIGHT);
        
        CommentaarField = new JTextField (20);
        CommentaarField.setHorizontalAlignment (JTextField.RIGHT);
        
        
        //labels
        IdLabel = new JLabel ("ID");
        NaamLabel = new JLabel ("Naam bedrijf");
        SoortLabel = new JLabel ("Soort vacature");
        DatumLabel = new JLabel ("Label");
        ReactieLabel = new JLabel ("Reactie");
        CommentaarLabel = new JLabel ("Commentaar");
        
        
        
        
//sets the components place

IdLabel.setBounds (50,50,120,20);
IdField.setBounds (180,50,150,20);

NaamLabel.setBounds (50,80,120,20);
NaamField.setBounds (180,80,150,20);

SoortLabel.setBounds (50,110,120,20);
SoortField.setBounds (180,110,150,20);

DatumLabel.setBounds (50,140,120,20);
DatumField.setBounds (180,140,150,20);

ReactieLabel.setBounds (50,170,120,20);
ReactieField.setBounds (180,170,150,20);

CommentaarLabel.setBounds (50,200,120,20);
CommentaarField.setBounds (180,200,150,50);

//add components to panel 

add (IdLabel);
add (IdField);
add (NaamLabel);
add (NaamField);
add (SoortLabel);
add (SoortField);
add (DatumLabel);
add (DatumField);
add (ReactieLabel);
add (ReactieField);
add (CommentaarLabel);
add (CommentaarField);
    }

}