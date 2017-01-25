/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template , choose Tools | Templates
 * and open the template in the editor.
 */
package avans.Presentation;

import datastorage.connection;
import datastorage.FormulierDAO;


import javax.swing.*; 
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.Button;
import domain.Formulier;
import java.util.Calendar;
import java.text.SimpleDateFormat;
/**
 *
 * @author rowan
 */

// Defines the frame
        public class FormulierGui extends JFrame 
    {
 
     public FormulierGui(){
     super();
     setSize (400, 400);
     setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
     setTitle ("Sollicitatie formulier");
     setContentPane( new SollicitatiePaneel ());
     setVisible (true);
  
 }
 
}
        
class SollicitatiePaneel extends JPanel {

    
        //inner class handlers
        class InvoerHandler implements ActionListener
        {   
            //waarom is het actionevent e?
            public void actionPerformed ( ActionEvent e)
            {
                Formulier formulier = formulierDAO.find(IdField.getText());
                IdField.setText(formulier.getID());
                NaamField.setText(formulier.getNaam());
                SoortField.setText(formulier.getSoort());
                DatumField.setText (formulier.getDatum().toString());
                ReactieField.setText (formulier.getReactie());
                CommentaarField.setText (formulier.getCommentaar());
                
            } 
            
        }
        class CreateHandler implements ActionListener
        {

        
            public void actionPerformed (ActionEvent e)
            {
                try{
                Formulier formulier = new Formulier();
                 formulier.setID(IdField.getText());
                 formulier.setNaam (NaamField.getText());
                 formulier.setSoort(SoortField.getText());
                 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
                 formulier.setDatum(dateFormat.parse(DatumField.getText()));
                 formulier.setReactie(ReactieField.getText());
                 formulier.setCommentaar(CommentaarField.getText());
                        
                 formulierDAO.Create(formulier);
                }
                catch (Exception ex){
                    System.out.println(ex.getMessage());
                }
            }
        }

            
            
    private JTextField IdField, NaamField, SoortField, DatumField, ReactieField, CommentaarField;
    private JLabel IdLabel, NaamLabel, SoortLabel, DatumLabel, ReactieLabel, CommentaarLabel;
    private JButton Create, Invoer, Update, Delete;
    private FormulierDAO formulierDAO;
    
    //disables flowlayout 
    public SollicitatiePaneel(){
        setLayout (null);
        
        //sets layout with fields
        
                 IdField = new JTextField (20);
                 NaamField = new JTextField (20);
                 SoortField = new JTextField (20);
                 DatumField = new JTextField (20);
                 ReactieField = new JTextField (20);
                 CommentaarField = new JTextField (20);
        
    
        //new labels
                 IdLabel = new JLabel ("ID");
                 NaamLabel = new JLabel ("Naam bedrijf");
                 SoortLabel = new JLabel ("Soort vacature");
                 DatumLabel = new JLabel ("Datum");
                 ReactieLabel = new JLabel ("Reactie");
                 CommentaarLabel = new JLabel ("Commentaar");
        
        
        
        //new buttons
                 Create = new JButton ("create");
                 Invoer = new JButton ("find");
                 
        //unused buttons explanation in "reflextieverslag"
                 Update = new JButton ("update");
                 Delete = new JButton ("delete");
       
        
        //New actionhandlers
        
        InvoerHandler ih = new InvoerHandler();
        Invoer.addActionListener (ih);
        
        CreateHandler ah  = new CreateHandler();
        Create.addActionListener (ah);
        

//sets the components place (to the right,to the bottom, length of field, width of field.

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
      
      Create.setBounds ( 50,280,90,20);
      Invoer.setBounds ( 155,280,90,20);
      Update.setBounds ( 260,280,90,20);
      Delete.setBounds (280,320,90,20);

//add componentsfields and labels to panel 

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

//add buttons

add (Create);
add (Invoer);



formulierDAO = new FormulierDAO();


    }

}