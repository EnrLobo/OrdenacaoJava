/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enrique.estruturadados.vetor;

import java.lang.reflect.Array;

/**
 *
 * @author Quiqu
 */
public class Lista<T> {
    
    private T[] elementos;
    private int tamanho;
    
    public Lista(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }
    
    public Lista(int capacidade, Class<T> tipoClasse){
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }
    
    public boolean adiciona(T elemento){
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho]  = elemento;
            this.tamanho++;
            return true;
         }
                   return false;
        }
     
    public boolean adiciona(int posicao, T elemento){
        this.aumentaCapacidade();
        if(!(posicao>=0 && posicao<tamanho)){
            throw new IllegalArgumentException("Posicao Invalida");
        }
        
        for(int i=this.tamanho-1;i>=posicao;i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        tamanho++;
        
        return true;
    }
    
    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length*2];
            for(int i=0; i<this.tamanho;i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }
    
    public T busca(int posicao){
        if(!(posicao>=0 && posicao<tamanho)){
            throw new IllegalArgumentException("Posicao Invalida");
        }
        return this.elementos[posicao];
    }
    
    /*public boolean  busca(Object elemento){ Esse é o modo que verifica se um elemento existe no vetor usando boolean
        for(int i=0; i<this.tamanho;i++){
            if(this.elementos[i].equals(elemento)){
                return true;
            }
        }
        return false;
    }*/
    
    public int busca(T elemento){ //Esse é o modo que verifica se um elemento existe no vetor usando int, ou seja, retornando a posição do elemento.
        for(int i=0; i<this.tamanho;i++){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }
    
    public void remove(int posicao){
        if(!(posicao>=0 && posicao<tamanho)){
            throw new IllegalArgumentException("Posicao Invalida");
        }
        for(int i = posicao;i<tamanho-1;i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }
    
    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        
        StringBuilder s = new StringBuilder();
        s.append("[");
        
        for(int i=0;i<this.tamanho-1;i++){
            s.append(this.elementos[i]);
            s.append(",");
        }
        if(this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }
        
        s.append("]");
        
        return s.toString();
    }
    
}
