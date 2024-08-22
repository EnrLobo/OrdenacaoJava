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
public class Aula09 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);
        
         vetor.adiciona("B");
         vetor.adiciona("G");
         vetor.adiciona("C");
         vetor.adiciona("E");
         vetor.adiciona("F");
         
         System.out.println(vetor);
         vetor.remove(1);
         System.out.println(vetor);
         
         System.out.println("Remover o Elemento E");
         int pos = vetor.busca("E");
         
         if(pos >=0 ){
             vetor.remove(pos);
         }else{
             System.out.println("O elemento não existe no vetor");
         }
         System.out.println(vetor);
         
         System.out.println("Remover o Elemento A");
         pos = vetor.busca("A");
         
         if(pos >=0 ){
             vetor.remove(pos);
         }else{
             System.out.println("O elemento nao existe no vetor");
         }
         System.out.println(vetor);
    }
}
