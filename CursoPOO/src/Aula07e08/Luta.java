/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula07e08;

import java.util.Random;

/**
 *
 * @author Quiqu
 */
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategory().equals(l2.getCategory()) && l1 != l2){
            this.aprovada = true;
            desafiante = l1;
            desafiado = l2;
        }else{
            this.aprovada = false;
        }
    }
    
    public void lutar(){
        Random rand = new Random();
        if(aprovada == false){
            System.out.println("A luta não foi aprovada.");
        }else{
            desafiante.apresentar();
            desafiado.apresentar();
            int vence = rand.nextInt(3);
            
            switch (vence) {
                case 0:
                    System.out.println("Empatou");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(desafiante.getName()+" venceu.");
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
                case 2:
                    System.out.println(desafiado.getName()+" venceu.");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
            }
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
