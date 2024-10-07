/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula13;

/**
 *
 * @author Quiqu
 */
public class CursoPOO {
    public static void main(String[] args) {
        
        Mamifero x = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();
        
        x.emitirSom();
        l.emitirSom();
        c.emitirSom();
        c.reagir("Olá");
        c.reagir(true);
        c.reagir(11, 45);
        c.reagir(10, 8.5);
        
    }
}
