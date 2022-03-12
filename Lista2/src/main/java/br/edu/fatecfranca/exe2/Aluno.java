package br.edu.fatecfranca.exe2;

public final class Aluno {
    
    private String nome;
    private int nroAluno, idade;
    private float p1, p2;
    
    // construtores
    public Aluno(){
        
    }
    
    public Aluno(String nome, int nroAluno, int idade, float p1, float p2) {
        this.setNome(nome);
        this.setNroAluno(nroAluno);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }
    
    // setters
    public void setNome(String nome){
        if (nome.length() <= 30){
            this.nome = nome;
            }
            else {
                System.out.println("Tamanho de nome inválido");
                this.nome = "inválido";
            }
    }
    
    public void setNroAluno(int nroAluno) {
        String s = Integer.toString(nroAluno);
        if (s.length() <= 6) {
            this.nroAluno = nroAluno;
        }
        else {
            System.out.println("Número inválido");
            this.nroAluno = 0;
        }
        
    }
    
    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
        else {
            System.out.println("A idade não pode ser negativa");
            this.idade = 0;
        }
    }
    
    public void setP1(float p1) {
        if (p1 >= 0) {
            this.p1 = p1;
        }
        else {
            System.out.println("A nota não pode ser negativa");
            this.p1 = 0;
        }
    }
    
    public void setP2(float p2) {
        if (p2 >= 0) {
            this.p2 = p2;
        }
        else {
            System.out.println("A nota não pode ser negativa");
            this.p2 = 0;
        }
    }
    
    // getters
    public String getNome() {
        return this.nome;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public float getP1() {
        return this.p1;
    }
    
    public float getP2() {
        return this.p2;
    }
       
    public float notaFinal() {
        return (this.p1 + this.p2) / 2;
    }
    
    public void dadosAluno() {
        System.out.println("Número aluno: " + this.nroAluno + " Nome: " + this.nome + " Idade: "
        + this.idade + " Nota final: " + this.notaFinal());
    }
}