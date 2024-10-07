/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula09;

/**
 *
 * @author Quiqu
 */
public class CursoPOO {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Enrique", 20, "M");
        p[1] = new Pessoa("Ana", 20, "F");
        
        l[0] = new Livro("Manifesto Comunista", "Karl Marx", 100, p[0]);
        l[1] = new Livro("Crimes ABC", "Agatha Christie", 300, p[1]);
        l[2] = new Livro("Lady Killers", "Eminen", 250, p[0]);
        
        l[0].abrir();;
        l[0].folhear(200);
        
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        
    }
}
