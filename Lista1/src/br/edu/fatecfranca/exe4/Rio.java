package br.edu.fatecfranca.exe4;

import javax.swing.JOptionPane;

public class Rio {
    String nome;
    float nivel;
    boolean poluido;
    
    public Rio() {
    
    }
    
    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    
    public void chover(float x) {
        this.nivel += x;
    }
    
    public void ensolarar(float x) {
        this.nivel -= x;
    }
    
    public void limpar() {
        if (this.poluido == false) {
            JOptionPane.showMessageDialog(null, "O rio está limpo!");
        }
    }
    
    public void sujar() {
        if (this.poluido == true) {
            JOptionPane.showMessageDialog(null, "O rio está sujo!"); 
        }
    }
    
    public void mostrar() {
        JOptionPane.showMessageDialog(null, "Nome: " + this.nome + " | Nível do Rio: " + this.nivel + 
                "m³ | Poluição: " + this.poluido);
    }
}
