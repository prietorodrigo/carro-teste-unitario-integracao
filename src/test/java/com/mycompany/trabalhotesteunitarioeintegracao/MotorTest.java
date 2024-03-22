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
public class MotorTest {
    
    public MotorTest() {
    }
    
    @Test
    public void testAvisoTemperatura() {
        Motor instance = new Motor();
        String result = instance.avisoTemperatura();
        System.out.println(result);
        assertEquals("normal", result);
    }

    @Test
    public void testObterTemperatura() {
        Motor instance = new Motor();
        int result = instance.obterTemperatura();
        System.out.println(result);
        assertEquals(100, result);
    }

    @Test
    public void testEstaEncendido() {
        Motor instance = new Motor();
        boolean result = instance.estaEncendido();
        System.out.println(result);
        assertFalse(result);
    }
    
}
