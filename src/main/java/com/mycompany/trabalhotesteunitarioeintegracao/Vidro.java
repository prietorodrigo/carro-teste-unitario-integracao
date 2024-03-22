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
public class Vidro {
    public boolean eletrico;
    public int fragilidade;
    public String tipo;
    
    public boolean esElectrico(){
        Random rd = new Random();
        return rd.nextBoolean();
    }
    
    public String abrirCerrarVidrio(boolean accion){
        if (accion) {
            return "ABIERTO";
        }
        else {
            return "CERRADO";
        }
    }
}
