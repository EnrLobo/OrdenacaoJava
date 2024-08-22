/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturadados.algoritimos.java;

import com.enrique.estruturadados.vetor.VetorObjetos;

/**
 *
 * @author Quiqu
 */
public class Aula10 {
    public static void main(String[] args) {
        VetorObjetos vetor = new VetorObjetos(3);
        Contato c1 = new Contato("Enrique", "97029749", "enriquealfenas@gmail.com");
        Contato c2 = new Contato("Ana", "123654", "linda@gmail.com");
        Contato c3 = new Contato("Luiza", "785698744", "saudade@gmail.com");
        Contato c4 = new Contato("Enrique", "97029749", "enriquealfenas@gmail.com");
        
        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("Tamanho: "+vetor.getTamanho());
        
        int pos = vetor.busca(c4);
        if(pos>=0){
            System.out.println("Elemento existe no vetor");
        }else{
            System.out.println("Elemento nao existe no vetor");
        }
        
        System.out.println(vetor);
    }
}
