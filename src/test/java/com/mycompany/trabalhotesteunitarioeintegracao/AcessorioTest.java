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
public class AcessorioTest {
    
    public AcessorioTest() {
    }

    @Test
    public void testObtenerAccSegNombre() {
        Acessorio instance = new Acessorio();
        String result = instance.obtenerAccSegNombre("RADIO");
        System.out.println(result);
        assertNotEquals("", result);
    }

    @Test
    public void testObtenerTempAire() {
        Acessorio instance = new Acessorio();
        String result = instance.obtenerTempAire();
        System.out.println(result);
        assertNotNull(result);
    } 
}
