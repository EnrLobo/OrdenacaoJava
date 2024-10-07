/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula04;

/**
 *
 * @author Quiqu
 */
public class CursoPOO {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta("Faber Castel", "Preta", 1.0f);
        
        c1.setModelo("BIC");
        c1.setPonta(0.5f);
        
        c1.status();
        c2.status();
        //System.out.println("Tenho uma caneta "+c1.getModelo()+" de ponta "+c1.getPonta());
    }
   
}
