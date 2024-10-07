/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula05;

/**
 *
 * @author Quiqu
 */
public class CursoPOO {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        
        /*c1.abrir();
        c1.depositar(100);
        c1.sacar(10);
        c1.mensalidade();*/
        
        c1.abrir();
        c2.abrir();
        
        System.out.println("A conta "+c1.getNumConta()+" do cliente "+c1.getNomeDono()+" possui o saldo de R$"+c1.getSaldo());
        System.out.println("A conta "+c2.getNumConta()+" do cliente "+c2.getNomeDono()+" possui o saldo de R$"+c2.getSaldo());
    }
}
