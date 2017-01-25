/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastorage;


import domain.Formulier;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import static javax.swing.text.html.HTML.Attribute.ID;
import java.util.logging.Logger;


/**
 *
 * @author rowan
 */
public class FormulierDAO {
    private Logger logger;
    
    
    
public FormulierDAO() {

    // Sets up the Insert/Create and Find statements for the database.
   

}

//creates and inserts the database rows

    public void Create (Formulier form) { 
        connection connection = new connection();
        if (connection.openConnection()) {
                // If a connection was successfully setup, execute the INSERT statement.
                
                
                java.sql.Date sqlDate = new java.sql.Date(form.getDatum().getTime());
                String sqlstatement = "insert into formulier values(" +
                        "'" + form.getID() + "'" + assembleSQL(form.getNaam()) + assembleSQL(form.getSoort()) + 
                        assembleSQL(sqlDate.toString()) + assembleSQL(form.getReactie()) + assembleSQL(form.getCommentaar()) + ")";
                connection.executeSqlDmlStatement(sqlstatement);
                connection.closeConnection();
        }
        
}       // Waarom hebben we deze erin gezet?
    private String assembleSQL(String value){
        return value.isEmpty() ? ",' '" : "," + "'" + value + "'";
    
    }
    
    // finds the ID 
    public Formulier find (String Id){
        Formulier formulier = null;
        connection connection = new connection();
        if (connection.openConnection()) {
            
            // What houd de resultset in en waarom de try en catch?
            
            
//  SELECT * FROM `formulier` WHERE ID='id1' 
            ResultSet rs = connection.executeSQLSelectStatement(
                        "SELECT * FROM Formulier WHERE ID='" + Id + "'");
            if (rs != null){
                try{
                    if (rs.next()){
                        formulier = new Formulier();
                        formulier.setID(rs.getString("ID"));
                        formulier.setNaam(rs.getString("Naam_bedrijf"));
                        formulier.setSoort(rs.getString("Soort_sollicitatie"));
                        formulier.setDatum(rs.getDate("Datum"));
                        formulier.setReactie(rs.getString("Reactie_terug"));
                        formulier.setCommentaar(rs.getString("commentaar"));
                         
                    }
                } catch (SQLException e) {
                        System.out.println(e); 
                        return null;
                }
                } 
             connection.closeConnection();
        }
        return formulier;
    }
}


