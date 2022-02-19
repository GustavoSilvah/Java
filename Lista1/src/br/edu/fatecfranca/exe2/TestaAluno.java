package br.edu.fatecfranca.exe2;

public class TestaAluno {

public static void main(String[] args) {
    
    Aluno obj1 = new Aluno("Daniel", 12, 24, 10, 9);
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