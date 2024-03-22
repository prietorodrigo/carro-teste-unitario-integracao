/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhotesteunitarioeintegracao;

/**
 *
 * @author user
 */
public class Pneu {
    public String perfil;
    public String marca;
    public int calibreatual;
    
//    public Pneu (String perfil, String marca, int calibreatual){
//        this.perfil = perfil;
//        this.marca = marca;
//        this.calibreatual = calibreatual;
//    }
    
    public String avisoPressao() {
        String pressao = "";
        if(obterPressao() < 20) {
            pressao = "baixa";
        }
        else {
            if (obterPressao() >= 20 || obterPressao() <= 30) {
                pressao = "media";
            }
            else {
                pressao = "alta";
            }
        }
        
        return pressao;
    }
    
    public int obterPressao () {
        this.calibreatual = (int)(Math.random()*50+1);
        return this.calibreatual;
    }
}
