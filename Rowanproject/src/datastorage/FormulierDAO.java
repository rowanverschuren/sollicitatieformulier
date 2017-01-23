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

/**
     * Tries to find the Job application identified by the given ID number in the
     * persistent data store, in this case a MySQL database. All other 
     * 'information are loaded as well.
     *
     * @param IdNumber identifies the Job application to be loaded from the
     * database
     *
     * @return the Member object to be found. In case member could not be found,
     * null is returned.
     */
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
       connection connection = new connection();
        if (connection.openConnection()) {
            ResultSet resultset = connection.executeSQLSelectStatement(
                        "SELECT Naam FROM Formulier = " + Naam + ";");
            connection.executeSqlFindStatement(sqlstatement);
                connection.closeConnection();
        }
        }

    
   
    
   public void Update (String Id, Formulier form){ 
      
       
   }
   
   
   public void delete (String Id){
   
   }
}
           
           
