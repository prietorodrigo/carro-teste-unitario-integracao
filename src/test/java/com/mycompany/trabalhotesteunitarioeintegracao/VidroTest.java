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
public class VidroTest {
    
    public VidroTest() {
    }
    
    @Test
    public void testEsElectrico() {
        Vidro instance = new Vidro();
        boolean result = instance.esElectrico();
        System.out.println(result);
        assertTrue(result);
    }

    @Test
    public void testAbrirCerrarVidrio() {
        Vidro instance = new Vidro();
        String result = instance.abrirCerrarVidrio(true);
        System.out.println(result);
        assertEquals("ABIERTO", result);
    }
    
}
