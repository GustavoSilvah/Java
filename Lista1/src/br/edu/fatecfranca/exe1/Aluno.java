package br.edu.fatecfranca.exe1;

import javax.swing.JOptionPane;

public class Aluno {
    int numeroAluno, idade;
    String nome;
    float p1, p2, notaFin;
    
    public Aluno() {
        
    }
    
    public Aluno(String nome, int numeroAluno, int idade, float p1, float p2) {
        this.nome = nome;
        this.numeroAluno = numeroAluno;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public void notaFinal() {
        notaFin = (p1 + p2) / 2;
    }
    
    /* Outra maneira de retornar a nota final
    public float notaFinal() {
        return (this.p1 + this.p2) / 2;
    }
    */
    
    public void dadosAluno() {
        JOptionPane.showMessageDialog(null, "Número do Aluno: " +this.numeroAluno + " Nome: " +this.nome+
                " Idade: " +this.idade+ " anos.");
    }
    
    public void passou() {
        if (notaFin >= 6) {
           JOptionPane.showMessageDialog(null, "O aluno " +this.nome+ " foi aprovado!");
        } else {
            JOptionPane.showMessageDialog(null, "O aluno " +this.nome+ " foi reprovado!");
        }
        
        // return (this.notaFinal() >= 6) ? "Aprovado" : "Reprovado";
    }
}
