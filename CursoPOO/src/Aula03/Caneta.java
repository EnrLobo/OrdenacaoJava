/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula03;

import Aula02.*;

/**
 *
 * @author Quiqu
 */
public class Caneta {
    String modelo;
    String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.print("Uma caneta "+this.cor);
        System.out.println("\nCarga: "+this.carga);
        System.out.println("Ponta: "+this.ponta);
        System.out.print("Está tampada? "+this.tampada+"\n");
    }
    
    public void rabiscar(){
        if(this.tampada==true){
            System.out.println("A caneta está tampada, não posso rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
}
