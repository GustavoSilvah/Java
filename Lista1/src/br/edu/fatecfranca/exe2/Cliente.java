package br.edu.fatecfranca.exe2;

import javax.swing.JOptionPane;

public class Cliente {
    int numeroConta, numeroAgencia;
    String nome;
    float saldo;
    
    public Cliente() {

    }
    
    public Cliente(String nome, int numeroConta, int numAgencia, float saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldo = saldo;
    }

    public void sacar(float x) {
        this.saldo -= x;
    }
    
    public void depositar (float x) {
        this.saldo += x;
    }
    
    public void realizarDeposito(float x) {
        this.saldo += x;
    }
    
    public void realizarSaque(float x) {
        this.saldo -= x;
    }
    
    public void dadosCliente() {
        JOptionPane.showMessageDialog(null, "Número da Conta: " + this.numeroConta + " | Nome do Cliente: "
        + this.nome + " | Saldo Atual: " + this.saldo);
    }
}

