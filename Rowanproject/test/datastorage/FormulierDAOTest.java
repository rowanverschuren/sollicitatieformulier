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
        form.setID("id1");
        form.setNaam ("bedrijf2");
        form.setSoort("Vacature");
        Calendar kalender = Calendar.getInstance();
        form.setDatum(kalender.getTime()); 
        form.setReactie("");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class FormulierDAO.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        String Id = "";
        FormulierDAO instance = new FormulierDAO();
        Formulier expResult = null;
        Formulier result = instance.find(Id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
