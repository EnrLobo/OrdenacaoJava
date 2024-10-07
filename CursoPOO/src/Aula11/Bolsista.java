/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula11;

/**
 *
 * @author Quiqu
 */
public class Bolsista extends Aluno{
    private double bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de "+getNome());
    }
    
    @Override
    public void pgMensalidade(){
        System.out.println(getNome()+" e bolsista, pagamento facilitado");
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
    
}
