/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02;

/**
 *
 * @author Quiqu
 */
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.print("Uma caneta "+this.cor);
        System.out.println("Carga: "+this.carga);
        System.out.println("Ponta: "+this.ponta);
        System.out.print("\nEstá tampada? "+this.tampada+"\n");
    }
    
    void rabiscar(){
        if(this.tampada==true){
            System.out.println("A caneta está tampada, não posso rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
