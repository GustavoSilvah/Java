package br.edu.fatecfranca.exe2;

public class Aluno {
    int numeroAluno, idade;
    String nome;
    float p1, p2, notaFin;
    
    public Aluno() {
        
    }
    
    public Aluno(String nom, int numalu, int idad, float pu, float pd) {
        nome = nom;
        numeroAluno = numalu;
        idade = idad;
        p1 = pu;
        p2 = pd;
    }
    
    public void notaFinal() {
        notaFin = (p1 + p2) / 2;
    }
    
    public void dadosAluno() {
        System.out.println("Número do Aluno: " +numeroAluno + " Nome: " +nome+
                " Idade: " +idade+ " anos.");
    }
    
    public void passou() {
        if (notaFin >= 6) {
           System.out.println("O aluno " +nome+ " foi aprovado!");
        } else {
            System.out.println("O aluno " +nome+ " foi reprovado!");
        }
    }
}
