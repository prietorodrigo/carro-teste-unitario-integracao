/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhotesteunitarioeintegracao;

/**
 *
 * @author user
 */
public class Painel {
    public String tipo;
    public String notificacao;
    public int velocidad;
    public Pneu pneu;
    public Motor motor;
    public Acessorio accesorio;
    
    public String geraAviso(int codAviso) {
        String aviso;
        this.motor = new Motor();
        this.pneu = new Pneu();
        this.accesorio = new Acessorio();
        
        switch (codAviso) {
            case 1:
                aviso = "A pressão do pneu es: " + this.pneu.avisoPressao();
                break;
            case 2:
                aviso = "A temperatura do carro é: " + this.motor.avisoTemperatura();
                break;
            case 3:
                aviso = "A temperatura do ar é: " + this.accesorio.obtenerTempAire();
                break;
            default:
                throw new AssertionError();
        }
        return aviso;
    }
    
    public int obtenerVelocidad() {
        this.velocidad = (int)(Math.random()*220+1);
        return this.velocidad;
    }
}
