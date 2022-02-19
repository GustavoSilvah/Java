package br.edu.fatecfranca.exe3;

public class Cliente {
    int numeroConta, numeroAgencia;
    String nome;
    float saldo;
    
    public Cliente() {

    }
    
    public Cliente(String nom, int numcont, int numagen, float sald) {
        nome = nom;
        numeroConta = numcont;
        numeroAgencia = numagen;
        saldo = sald;
    }

    Cliente(String jorge, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void realizarDeposito(float x) {
        saldo += x;
    }
    
    public void realizarSaque(float x) {
        saldo -= x;
    }
    
    public void dadosCliente() {
        System.out.println("Número da Conta: " + numeroConta + " | Nome do Cliente: "
        + nome + " | Saldo Atual: " + saldo);
    }
}

