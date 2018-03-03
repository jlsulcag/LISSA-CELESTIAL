/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lissa.bl;

import lissa.be.AtencionOcupacional;
import lissa.be.FichaOsteomuscular;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JSULCAG
 */
public class FichaOsteomuscularBlTest {
    
    public FichaOsteomuscularBlTest() {
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
     * Test of registrar method, of class FichaOsteomuscularBl.
     */
    @Test
    public void testRegistrar() {
        System.out.println("registrar");
        FichaOsteomuscular obj = null;
        FichaOsteomuscularBl instance = new FichaOsteomuscularBl();
        FichaOsteomuscular expResult = null;
        FichaOsteomuscular result = instance.registrar(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConclusion method, of class FichaOsteomuscularBl.
     */
    @Test
    public void testGetConclusion() {
        System.out.println("getConclusion");
        AtencionOcupacional oAtencionOcupacional = null;
        FichaOsteomuscularBl instance = new FichaOsteomuscularBl();
        String expResult = "";
        String result = instance.getConclusion(oAtencionOcupacional);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
