package br.edu.fatecfranca.exe0;

import java.util.ArrayList;

public class Niver {
    
    private int dia;
    private String mes;
    
    // construtores
    public Niver() {
        
    }
    
    public Niver(int dia, String mes) {
        this.setDia(dia);
        this.setMes(mes);
    }
    
    // setters
    public void setDia(int dia) {
        if ((dia >= 1) && (dia <= 31)) {
            this.dia = dia;
        } 
        else {
            System.out.println("Dia inválido!");
            this.dia = 0;
        }
    }
    
    public void setMes(String mes) {
        ArrayList<String> vetor = new ArrayList();
        vetor.add("Janeiro");
        vetor.add("Fevereiro");
        vetor.add("Março");
        vetor.add("Abril");
        vetor.add("Maio");
        vetor.add("Junho");
        vetor.add("Julho");
        vetor.add("Agosto");
        vetor.add("Setembro");
        vetor.add("Outubro");
        vetor.add("Novembro");
        vetor.add("Dezembro");
        
        if (vetor.contains(mes)) {
            this.mes = mes;
        } 
        else {
            this.mes = "Inválido";
            System.out.println("Mês inválido!");
        }
    }
    
    // getters
    public int getDia() {
        return this.dia;
    }
    
    public String getMes() {
        return this.mes;
    }
}
