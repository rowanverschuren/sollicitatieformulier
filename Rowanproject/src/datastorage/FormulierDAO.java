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
   //  logger = Logger.getLogger("Tijdelijk");
   
    
    

}

//creates and inserts the database rows

    public void Create (Formulier form) { 
        connection connection = new connection();
        if (connection.openConnection()) {
                // If a connection was successfully setup, execute the INSERT statement.
   //             String sqlstatement = "insert into formulier values('hahah','sanders', 'Vacature', '2017-01-12', 'ja', 'ja')";
                java.sql.Date sqlDate = new java.sql.Date(form.getDatum().getTime());
                String sqlstatement = "insert into formulier values(" +
                        "'" + form.getID() + "'" + assembleSQL(form.getNaam()) + assembleSQL(form.getSoort()) + 
                        assembleSQL(sqlDate.toString()) + assembleSQL(form.getReactie()) + assembleSQL(form.getCommentaar()) + ")";
                connection.executeSqlDmlStatement(sqlstatement);
                connection.closeConnection();
        }
 //       logger.info(form.getNaam());
        
}
    private String assembleSQL(String value){
        return value.isEmpty() ? ",' '" : "," + "'" + value + "'";
     //   return value.isEmpty() ? "" : "," +  value;
    }
    
    // finds the ID 
    public Formulier find (String Id){
        Formulier formulier = null;
        connection connection = new connection();
        if (connection.openConnection()) {
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


    
   
    
   public void Update (String Id, Formulier form){ 
    
        connection connection = new connection();
        if (connection.openConnection()) {
                // If a connection was successfully setup, execute the UPDATE statement
                
                
                
                connection.executeSqlDmlStatement(sqlstatement);
                connection.closeConnection();
        }
        }
       
      
   
   
   public void delete (String id){
       
       boolean result = false;

        if (id != null) {
            // First open the database connection.
            connection connection = new connection();
            if (connection.openConnection()) {
                // Execute the delete statement using the membership number to
                // identify the member row.
                result = connection.executeSqlDmlStatement(
                        "DELETE FROM formulier WHERE ID = " + delete.getID() + ";");

                // Finished with the connection, so close it.
                connection.closeConnection();
            }
            // else an error occurred leave 'member' to null.
        }
   
   }

}


