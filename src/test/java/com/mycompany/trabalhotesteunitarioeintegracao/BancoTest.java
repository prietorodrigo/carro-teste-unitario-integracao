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
public class BancoTest {
    
    public BancoTest() {
    }
    
    @Test
    public void testEsBancoCuero() {
        Banco instance = new Banco();
        instance.material = "cuero";
        boolean result = instance.esBancoCuero();
        System.out.println(result);
        assertTrue(result);
    }

    @Test
    public void testEsReclinable() {
        Banco instance = new Banco();
        boolean result = instance.esReclinable();
        System.out.println(result);
        assertFalse(result);
    }
    
}
