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
public class CarroTest {
    
    public CarroTest() {
    }
    
    @Test
    public void testMostrarAvisoAtivo() {
        Carro instance = new Carro();
        String result = instance.mostrarAvisoAtivo();
        System.out.println(result);
        assertNotEquals("", result);
    }

    @Test
    public void testObtenerColor() {
        Carro instance = new Carro();
        String result = instance.obtenerColor();
        System.out.println(result);
        assertEquals("Azul", result);
    }

    @Test
    public void testEstaEnMovimiento() {
        Carro instance = new Carro();
        boolean result = instance.estaEnMovimiento();
        System.out.println(result);
        assertEquals(true,result);
    }

    @Test
    public void testObtenerAno() {
        Carro instance = new Carro();
        int result = instance.obtenerAno();
        System.out.println(result);
        assertNotNull(result);
    }
    
}
