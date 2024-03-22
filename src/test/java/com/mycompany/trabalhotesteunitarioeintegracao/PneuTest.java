/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.trabalhotesteunitarioeintegracao;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class PneuTest {
    
    public PneuTest() {
    }
    
    @Test
    public void testAvisoPressao() {
        Pneu instance = new Pneu();
        String result = instance.avisoPressao();
        System.out.println(result);
        assertEquals("media", result);
    }

    @Test
    public void testObterPressao() {
        Pneu instance = new Pneu();
        int result = instance.obterPressao();
        System.out.println(result);
        assertNotNull(result);
    }
    
}
