/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula04;

/**
 *
 * @author Quiqu
 */
public class Caneta {
 public String modelo;
 private float ponta;
 private boolean tampada;
 private String cor;
 
 public Caneta(){//Construtor
     this.tampar();
     this.cor = "Azul";
 }
 
 public Caneta(String m, String c, float p){
     this.modelo = m;
     this.cor = c;
     this.ponta = p;
 }
 
 public void tampar(){
     this.tampada = true;
 }
 
 public void destampar(){
     this.tampada = false;
 }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }
 
    public void status(){
        System.out.println("\nSOBRE A CANETA");
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Cor: "+this.cor);
        System.out.println("Tampada: "+this.tampada);
    }
}
