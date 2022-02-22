package br.edu.fatecfranca.exe1;

import javax.swing.JOptionPane;

public class TestaAluno {

public static void main(String[] args) {
    
    String auxNome = JOptionPane.showInputDialog("Nome: ");
    int auxNumAluno = Integer.parseInt(JOptionPane.showInputDialog("Número do Aluno:"));
    int auxIdade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
    float auxP1 = Integer.parseInt(JOptionPane.showInputDialog("Nota Prova 1:"));
    float auxP2 = Integer.parseInt(JOptionPane.showInputDialog("Nota Prova 2:"));
    
    Aluno obj1 = new Aluno(auxNome, auxNumAluno, auxIdade, auxP1, auxP2);
    obj1.dadosAluno();
    obj1.notaFinal();
    obj1.passou();
    
    System.out.println("================================");
    // Teste 2
    Aluno obj2 = new Aluno("Gustavo", 9, 20, 4, 4);
    obj2.dadosAluno();
    obj2.notaFinal();
    obj2.passou();
    }
}