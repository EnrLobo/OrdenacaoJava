/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenacaojava;


import java.time.LocalDate;

/**
 *
 * @author Quiqu
 */
public class Candidato implements Comparable<Candidato>{

    private String nome;
    private Integer id;
    private LocalDate dataNasc;
    private Double nota;

    public Candidato(Integer id, String nome, LocalDate dataNasc, Double nota) {
        this.id = id;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Candidato: "  + nome+",  Data de Nascimento: " + dataNasc + ", Nota: " + nota ;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
    
    
    
    @Override
    public int compareTo(Candidato outroC) {
        int comparaN = this.nota.compareTo(outroC.getNota());
        
        if(comparaN == 0){
            return this.dataNasc.compareTo(outroC.getDataNasc());
        }
        
        return comparaN;
        
    }
    
}
