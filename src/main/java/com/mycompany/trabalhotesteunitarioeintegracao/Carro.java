/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhotesteunitarioeintegracao;

/**
 *
 * @author user
 */
public class Carro {
    public String cor;
    public String modelo;
    public String marca;
    public int ano;
    public Painel painel;
    public Motor motor;
    
//    public Carro (String cor, String modelo, String marca, int ano, Painel painel) {
//        this.cor = cor;
//        this.modelo = modelo;
//        this. marca = marca;
//        this.ano = ano;
//        this.painel = painel;
//    }
    
    public String mostrarAvisoAtivo() {
        this.painel = new Painel();
        int random = (int)(Math.random()*3+1);
        return this.painel.geraAviso(random);
    }
    
    public String obtenerColor() {
        int random = (int)(Math.random()*5+1);
        switch(random) {
            case 1:
                this.cor = "Blanco";
                break;
            case 2:
                this.cor = "Azul";
                break;
            case 3:
                this.cor = "Rojo";
                break;
            case 4:
                this.cor = "Negro";
                break;
            case 5:
                this.cor = "Gris";
                break;
        }
        return this.cor;
    }
    
    public boolean estaEnMovimiento(){
        this.painel = new Painel();
        this.motor = new Motor();
        return this.painel.obtenerVelocidad() > 0 && this.motor.estaEncendido();
    }
    
    public int obtenerAno(){
        int random = (int)(Math.random()*(2023-1990)+1990);
        return random;
    }
}
