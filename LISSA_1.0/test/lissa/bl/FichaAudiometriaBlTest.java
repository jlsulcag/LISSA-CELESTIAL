/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lissa.bl;

import lissa.be.AtencionOcupacional;
import lissa.be.FichaAudiometria;
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
public class FichaAudiometriaBlTest {
    
    public FichaAudiometriaBlTest() {
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
     * Test of registrar method, of class FichaAudiometriaBl.
     */
    @Test
    public void testRegistrar() {
        System.out.println("registrar");
        FichaAudiometria obj = null;
        FichaAudiometriaBl instance = new FichaAudiometriaBl();
        FichaAudiometria expResult = null;
        FichaAudiometria result = instance.registrar(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConclusion method, of class FichaAudiometriaBl.
     */
    @Test
    public void testGetConclusion() {
        System.out.println("getConclusion");
        AtencionOcupacional oAtencionOcupacional = null;
        FichaAudiometriaBl instance = new FichaAudiometriaBl();
        String expResult = "";
        String result = instance.getConclusion(oAtencionOcupacional);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
