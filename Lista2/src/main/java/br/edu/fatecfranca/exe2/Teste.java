package br.edu.fatecfranca.exe2;


public class Teste {
    
    public static void main(String[] args) {
        
        Aluno obj1 = new Aluno();
        obj1.setNome("Pedro");
        obj1.setNroAluno(4);
        obj1.setIdade(16);
        obj1.setP1(10);
        obj1.setP2(8);
        obj1.notaFinal();
        obj1.dadosAluno();
        
        // Acessar as variáveis de instância sem os métodos get e set
        Aluno obj2 = new Aluno("Rúbens", 45789213, 14, 8, 8);
        obj2.notaFinal();
        obj2.dadosAluno();
        //System.out.println(obj2.toString());
            
    }
}
