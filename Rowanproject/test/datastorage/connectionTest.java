/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastorage;

import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rowan
 */
public class connectionTest {     
    
    public connectionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of openConnection method, of class connection.
     */
    @Test
    public void testOpenConnection() {
        System.out.println("openConnection");
        connection instance = new connection();
        boolean expResult = true;
        boolean result = instance.openConnection();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of connectionIsOpen method, of class connection.
     */
    @Test
    public void testConnectionIsOpen() {
        System.out.println("connectionIsOpen");
        connection instance = new connection();
        boolean expResult = false;
        boolean result = instance.connectionIsOpen();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of closeConnection method, of class connection.
     */
    @Test
    public void testCloseConnection() {
        System.out.println("closeConnection");
        connection instance = new connection(); 
        instance.closeConnection();
        
    }

    /**
     * Test of executeSQLSelectStatement method, of class connection.
     */
    @Test
    public void testExecuteSQLSelectStatement() {
        System.out.println("executeSQLSelectStatement");
        String query = "";
        connection instance = new connection();
        ResultSet expResult = null;
        ResultSet result = instance.executeSQLSelectStatement(query);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of executeSqlDmlStatement method, of class connection.
     */
    @Test
    public void testExecuteSqlDmlStatement() {
        System.out.println("executeSqlDmlStatement");
        String query = "";
        connection instance = new connection();
        boolean expResult = false;
        boolean result = instance.executeSqlDmlStatement(query);
        assertEquals(expResult, result);
        
    }
    
}
