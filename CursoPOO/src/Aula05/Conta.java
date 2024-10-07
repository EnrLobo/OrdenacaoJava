/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula05;

import java.util.Scanner;

/**
 *
 * @author Quiqu
 */
public class Conta {
    
    private int numConta;
    private String tipo;
    private String nomeDono;
    private double saldo;
    private boolean status;//False para fechada e True para aberta
    
    Scanner scan = new Scanner(System.in);
    
    public Conta(){
        System.out.printf("Digite o número da Conta: ");
        numConta = scan.nextInt();
        scan.nextLine();
        System.out.printf("Digite o nome do dono da conta: ");
        nomeDono = scan.nextLine();
        setStatus(false);
        setSaldo(0);
    }
    
    public void abrir(){
        System.out.println("SELECIONE O TIPO DE CONTA");
        System.out.println("1 - Conta Poupança");
        System.out.println("2 - Conta Corrente");
        int cont = scan.nextInt();
        scan.nextLine();
        
        if(cont == 1){
            System.out.println("Conta Poupança aberta!");
            setSaldo(150);
            setStatus(true);
            this.setTipo("Conta Poupança");
        }else if(cont == 2){
            System.out.println("Conta Corrente aberta!");
            setSaldo(50);
            setStatus(true);
            this.setTipo("Conta Corrente");
        }else{
            System.out.println("Opção inválida");
        }
    }
    
    public void fechar(){
        if(this.isStatus() != false){
            if(getSaldo() < 0){
                System.out.println("Para fechar a conta todos os débitos deverão ser quitados.");
            }
            if(getSaldo() > 0){
                System.out.println("Para fechar a conta o saldo deve ser zerado.");
            }
            else{
                System.out.println("Conta fechada");
                setStatus(false);
            }
        }else{
            System.out.println("A conta já está fechada");
        }
    }
    
    public void depositar(double d){
        if(this.isStatus() != false){
            this.setSaldo(this.getSaldo() + d);
        }else{
            System.out.println("A conta está fechada");
        }
    }
    
    public void sacar(double s){
        if(this.isStatus() != false){
            if(this.getSaldo() > 0){
                this.setSaldo(this.getSaldo()-s);
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("A conta está fechada");
        }
    }
    
    public void mensalidade(){
        if(this.getTipo().equals("Conta Poupança")){
            this.setSaldo(this.getSaldo()-20.00);
        }else{
            this.setSaldo(this.getSaldo()-12.00);
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
