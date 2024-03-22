/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.trabalhotesteunitarioeintegracao;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author user
 */
public class PainelTest {
    private Painel instance;
    
    public PainelTest() {
        instance = new Painel();
    }
    
    @Test
    public void testGeraAviso() {
        System.out.println(instance.geraAviso(1));
        assertNotNull( instance.geraAviso(1));
    }

    @Test
    public void testObtenerVelocidad() {
        System.out.println(instance.obtenerVelocidad());
        assertNotNull(instance.obtenerVelocidad());
    }  
}
