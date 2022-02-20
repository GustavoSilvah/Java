package br.edu.fatecfranca.exe0;
public class Carro {
    // declaração das variáveis
    // Java é fortemente tipado
    String modelo;
    int ano;
    float velocidade;
    boolean motor; // motor true é ligado e false é desligado
    
    // método construtor
    public Carro(String mod, int an, float vel, boolean mt){
        modelo = mod;
        ano = an;
        velocidade = vel;
        motor = mt;
    }
    // linha teste
    // criação dos métodos
    void ligar(){
        motor = true;
    }
    void desligar(){
        motor = false;
        velocidade = 0;
    }
    void acelerar(float x){ // x representa o quanto será acelerado
        if (motor) {
            velocidade += x;
        }
    }
    void frear(float x){
        if (motor){
            velocidade -= x;
        }
    }
    
    void mostrar(){
        System.out.println("Modelo: " + modelo + " Ano: " + ano + 
                " Vel " + velocidade + " Motor " + motor);
    }
}
