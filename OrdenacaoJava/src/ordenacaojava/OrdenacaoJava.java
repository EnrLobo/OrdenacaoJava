/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenacaojava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Quiqu
 */
public class OrdenacaoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        
        String path = "C:\\Users\\Quiqu\\Downloads\\dadosConcurso.csv";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Candidato> list = new ArrayList<Candidato>();
         InsertionSort<Candidato> isort = new InsertionSort<>();
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
          
            String line = br.readLine();
            line = br.readLine();
            
            
            
            while(line != null){
                String[] vect = line.split(",");
                int id = Integer.parseInt(vect[0]) ;
                String nome = vect[1];
                String dataNasc = vect[2];
                Double nota = Double.parseDouble(vect[3]);
                
                
                
                LocalDate dataNascConvertido = LocalDate.parse(dataNasc, formatter);
                
                
                Candidato cand = new Candidato(id, nome, dataNascConvertido, nota);
                list.add(cand);
                
                
                line = br.readLine();
            }      
            
            Comparator<Candidato> comparaNota = (c1, c2) -> c1.getNota().compareTo(c2.getNota());
        
            Comparator<Candidato> comparaDataN = (c1,c2) -> c1.getDataNasc().compareTo(c2.getDataNasc());
        
            
            
            System.out.println("CANDIDATOS: ");
            
            Candidato[] candidatoA = new Candidato[list.size()];
            candidatoA = list.toArray(candidatoA);
            
            isort.sort(candidatoA, comparaDataN);
            isort.sort(candidatoA, comparaNota);
            
            
            
            for(Candidato c : candidatoA){
                System.out.println(c.toString());
            }
        }catch(IOException e){
                        System.out.println("Erro: "+e.getMessage());
        }
       
        
    }
}
