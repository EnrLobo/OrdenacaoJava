/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturadados.algoritimos.java;

import com.enrique.estruturadados.vetor.Vetor;

/**
 *
 * @author Quiqu
 */
public class Aula04 {
    public static void main(String[] args) {
          Vetor vetor = new Vetor(10);
        
            vetor.adiciona("Elemento 1");
            vetor.adiciona("Elemento 2");
            vetor.adiciona("Elemento 3");
        
            System.out.println(vetor.getTamanho());
            System.out.println(vetor.toString());
    }
}
