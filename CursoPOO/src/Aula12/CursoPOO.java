/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula12;

/**
 *
 * @author Quiqu
 */
public class CursoPOO {
    public static void main(String[] args) {
        
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra s = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish gf = new GoldFish();
        Arara ara = new Arara();
        
        m.setPeso(35.3);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        a.setPeso(2.0);
        a.alimentar();
        a.locomover();
        a.emitirSom();
        
        c.locomover();
        c.emitirSom();
        k.emitirSom();
    }
}
