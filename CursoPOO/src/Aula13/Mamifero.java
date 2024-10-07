/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula13;

import java.util.Scanner;

/**
 *
 * @author Quiqu
 */
public class Mamifero extends Animal{
    
    Scanner scan = new Scanner(System.in);

    private String corPelo;
    
    public void pelo(){
        System.out.println("Digite a cor do pelo: ");
        this.corPelo = scan.nextLine();
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }
    
}
