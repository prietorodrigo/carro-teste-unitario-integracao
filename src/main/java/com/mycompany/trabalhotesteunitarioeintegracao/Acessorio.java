/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhotesteunitarioeintegracao;

/**
 *
 * @author user
 */
public class Acessorio {
    public String nome;
    public String ubicacao;
    public String tipo;

//    public Acessorio(String nome, String ubicacao, String tipo) {
//        this.nome = nome;
//        this.ubicacao = ubicacao;
//        this.tipo = tipo;
//    }
    
    public String obtenerAccSegNombre(String nome){
        switch(nome) {
            case "AIRE":
                return "Tipo: calefacción, Ubicación: panel";
            case "RADIO":
                return "Tipo: entretenimiento, Ubicación: panel";
            case "CARGADOR":
                return "Tipo: utilitario, Ubicación: panel";
            case "AIRBAG":
                return "Tipo: seguridad, Ubicación: volante-panel";
            default:
                return null;    
        }
    }
    public String obtenerTempAire(){
        int random = (int)(Math.random()*3+1);
        if(random == 1){
            return "Frío";
        }
        if(random == 2) {
            return "Neutro";
        }
        if (random == 3) {
            return "Calor";
        }
        return null;
    }
}
