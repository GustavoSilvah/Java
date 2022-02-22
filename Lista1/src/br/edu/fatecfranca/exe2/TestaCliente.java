package br.edu.fatecfranca.exe2;

import javax.swing.JOptionPane;

public class TestaCliente {
 
    
    public static void main (String[] args) {
            
        String nome = JOptionPane.showInputDialog("Nome do Cliente:");
        int auxConta = Integer.parseInt(JOptionPane.showInputDialog("Número da Conta:"));
        int auxAgencia = Integer.parseInt(JOptionPane.showInputDialog("Número da Agência:"));
        float saldo = Float.parseFloat(JOptionPane.showInputDialog("Saldo:"));
        
        Cliente obj1 = new Cliente(nome, auxConta, auxAgencia, saldo);
        obj1.dadosCliente();
        obj1.realizarDeposito(200);
        obj1.dadosCliente();
        obj1.realizarSaque(300);
        obj1.dadosCliente();
        
        System.out.println("================================");
        // Teste 2
        Cliente obj2 = new Cliente("Beltrano", 315, 06, 1200);
        obj2.dadosCliente();
        obj2.realizarSaque(300);
        obj2.dadosCliente();
        obj2.realizarDeposito(200);;
        obj2.dadosCliente();
        
    }
}
