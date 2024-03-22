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
public class Motor {
    public int cilindrada;
    public int cilindros;
    public boolean ligado;
    public int temperatura;
    
//    public Motor(int cilindrada, int cilindros, boolean ligado, int temperatura){
//        this.cilindrada = cilindrada;
//        this.cilindros = cilindros;
//        this.ligado = ligado;
//        this.temperatura = temperatura;
//    }

    public String avisoTemperatura() {
        String temp = "";
        if(obterTemperatura() > 90) {
            temp = "alta";
        }
        else {
            temp = "normal";
        }
        return temp;
    }
    
    public int obterTemperatura () {
        this.temperatura = (int)(Math.random()*200+1);
        return this.temperatura;
    }
    
    public boolean estaEncendido(){
        Random rd = new Random();
        return rd.nextBoolean();
    }
}
