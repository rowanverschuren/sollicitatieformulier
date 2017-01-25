/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastorage;

import domain.Formulier;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Calendar;

/**
 *
 * @author rowan
 */
public class FormulierDAOTest {
    
    public FormulierDAOTest() {
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
     * Test of Create method, of class FormulierDAO.
     */
    @Test
    public void testCreate() {
        System.out.println("Create");
        Formulier form = new Formulier();
        form.setID("1");
        form.setNaam ("bedrijf7");
        form.setSoort("Open sollicitatie");
        Calendar kalender = Calendar.getInstance();
        form.setDatum(kalender.getTime()); 
        form.setReactie("nee");
        form.setCommentaar("");
        
        
        
        
        FormulierDAO instance = new FormulierDAO();
        instance.Create(form);
        
    }

    /**
     * Test of Update method, of class FormulierDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("Update");
        String Id = "";
        Formulier form = null;
        FormulierDAO instance = new FormulierDAO();
        instance.Update(Id, form);
       
    }

    /**
     * Test of find method, of class FormulierDAO.
     */
    @Test
    public void testFindOnExistingFormulier() {
        System.out.println("find");
        FormulierDAO instance = new FormulierDAO();
        String expectedID = "id1";
        String expectedNaam = "bedrijf2";
        Formulier result = instance.find(expectedID);
        assertEquals(expectedID, result.getID());
        assertEquals(expectedNaam, result.getNaam());
       
    }
/**
     * Test of find method, of class FormulierDAO.
     */
    @Test
    public void testFindOnNonExistingFormulier() {
        System.out.println("find");
        FormulierDAO instance = new FormulierDAO();
        String ID = "&&&&&&&&&&";
        Formulier result = instance.find(ID);
        assertNull(result);
        
    }
    /**
     * Test of delete method, of class FormulierDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String Id = "";
        FormulierDAO instance = new FormulierDAO();
        instance.delete(Id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
