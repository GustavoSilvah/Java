package br.edu.fatecfranca.exe4;

public class Rio {
    String nome;
    float nivel;
    boolean poluido;
    
    public Rio() {
    
    }
    
    public Rio(String nom, float niv, boolean polui) {
        nome = nom;
        nivel = niv;
        poluido = polui;
    }
    
    public void chover(float x) {
        nivel += x;
    }
    
    public void ensolarar(float x) {
        nivel -= x;
    }
    
    public void limpar() {
        if (poluido = false) {
            System.out.println("O rio está limpo!");
        }
    }
    
    public void sujar() {
        if (poluido == true) {
            System.out.println("O rio está sujo!"); 
        }
    }
    
    public void mostrar() {
        System.out.println("Nome: " + nome + " | Nível do Rio: " + nivel + "m³ | Poluição: " + poluido);
    }
}
