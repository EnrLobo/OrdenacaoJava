/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula07e08;

/**
 *
 * @author Quiqu
 */
public class CursoPOO {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        Luta luta = new Luta();
        
        l[0] = new Lutador("Enrique", "Brasil", 20, 1.78, 71.00, 12, 0, 0 );
        l[1] = new Lutador("João", "Brasil", 19, 1.73, 71.00, 2, 1, 5 );
        l[2] = new Lutador("Pedro", "Brasil", 19, 1.81, 80.00, 14, 2, 0 );
        l[3] = new Lutador("Luis", "Brasil", 20, 1.80, 67.00, 5, 0, 2 );
        l[4] = new Lutador("Yung", "China", 25, 1.95, 100.00, 10, 2, 7 );
        l[5] = new Lutador("Aminov", "Russia", 30, 1.85, 90.00, 5, 4, 1 );
        
        luta.marcarLuta(l[1], l[1]);
        luta.lutar();
        l[0].status();
        l[1].status();
        
    }
}
