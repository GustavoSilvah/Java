package br.edu.fatecfranca.exe0;

import javax.swing.JOptionPane;

public class Carro {
    // declaração das variáveis
    // Java é fortemente tipado
    String modelo;
    int ano;
    float velocidade;
    boolean motor; // motor true é ligado e false é desligado
    
    public Carro() {
    
    }
    
    // método construtor
    public Carro(String modelo, int ano, float velocidade, boolean motor){
        // recebe os parâmetros do usuário e atribui para o objeto
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
        this.motor = motor;
    }

    // criação dos métodos
    void ligar(){
        this.motor = true;
    }
    void desligar(){
        this.motor = false;
        this.velocidade = 0;
    }
    void acelerar(float x){ // x representa o quanto será acelerado
        if (this.motor) {
            this.velocidade += x;
        }
    }
    void frear(float x){
        if (this.motor){
            this.velocidade -= x;
        }
    }
    
    void mostrar(){
        JOptionPane.showMessageDialog(null, "Modelo: " + this.modelo + " Ano: " + this.ano + 
                " Vel " + this.velocidade + " Motor " + this.motor);
    }
}
