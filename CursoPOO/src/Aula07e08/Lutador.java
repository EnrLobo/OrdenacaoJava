/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula07e08;

/**
 *
 * @author Quiqu
 */
public class Lutador {
    private String name;
    private String nacionality;
    private int age;
    private double height;
    private double weight;
    private String category;
    private int wins;
    private int defeats;
    private int draws;
    
    public Lutador(String nam, String nat, int ag, double hei, double wei,  int w, int de, int dr){
        this.name = nam;
        this.nacionality = nat;
        this.age = ag;
        this.height = hei;
        this.setWeight(wei);
        this.wins = w;
        this.defeats = de;
        this.draws = dr;
    }
    
    public void apresentar(){
        System.out.println("----UFC 358----");
        System.out.println("Nome: "+getName());
        System.out.println("Idade: "+getAge());
        System.out.println("Nacionalidade: "+getNacionality());
        System.out.println("Peso: "+getWeight());
        System.out.println("Altura: "+getHeight());
        System.out.println("Categoria: "+getCategory());
        System.out.println("Vitorias: "+getWins());
        System.out.println("Empates: "+getDraws());
        System.out.println("Derrotas: "+getDefeats());
    }
    
    public void status(){
        System.out.println("----CARD ATLETA----");
        System.out.println("Nome: "+getName());
        System.out.println("Idade: "+getAge());
        System.out.println("Categoria: "+getCategory());
        System.out.println("Vitorias: "+getWins());
        System.out.println("Derrotas: "+getDefeats());
        System.out.println("Empates: "+getDraws());
    }
    
    public void ganharLuta(){
        setWins(getWins()+1);
    }
    
    public void perderLuta(){
        setDefeats(getDefeats()+1);
    }
    
    public void empatarLuta(){
        setDraws(getDraws()+1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        setCategory();
    }

    public String getCategory() {
        return category;
    }

    private void setCategory() {
        if(weight<=70.3){
            this.category = "Leve";
        }else if(weight<80.0){
            this.category = "Medio";
        }else{
            this.category = "Pesado";
        }
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }
    
    
}
