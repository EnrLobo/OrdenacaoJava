/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula11;

/**
 *
 * @author Quiqu
 */
public class CursoPOO {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        
       //VISITANTE
       /* Visitante v1 = new Visitante();
        
        v1.setNome("Juvenal");
        v1.setIdade(23);
        v1.setSexo("M");
        
        System.out.println(v1.toString());*/
       //----------------------------------------------------------------------------
       //ALUNO
       /*Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1);
        a1.setCurso("Info");
        a1.setIdade(15);
        a1.setSexo("M");
        a1.pgmensalidade();*/
        //----------------------------------------------------------------------------
       //BOLSISTA
       Bolsista b1 = new Bolsista();
       b1.setMatricula(11222);
       b1.setNome("Carlos");
       b1.setBolsa(12.5);
       b1.setSexo("M");
       b1.pgMensalidade();
    }
}
