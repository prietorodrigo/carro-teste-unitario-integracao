/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhotesteunitarioeintegracao;

import java.util.Random;

/**
 *
 * @author user
 */
public class Banco {
    public String conforto;
    public boolean reclinavel;
    public String material;
    
    public boolean esBancoCuero() {
        boolean respuesta = false;
        if (this.material.toUpperCase().equals("CUERO"))
            respuesta = true;
        return respuesta;
    }
    
    public boolean esReclinable(){
        Random rd = new Random();
        this.reclinavel = rd.nextBoolean();
        return this.reclinavel;
    }
}
