package br.edu.fatecfranca.exe3;

import javax.swing.JOptionPane;

public class Produto {
    int id, qtde;
    String descricao;
    float preco;
    
    public Produto(){
        
    }
    public Produto(int id, int qtde, String descricao, float preco){
        this.id = id;
        this.qtde = qtde;
        this.descricao = descricao;
        this.preco = preco;
    }
    public void comprar(int x){
        this.qtde += x;
    }
    public void vender(int x){
        this.qtde -= x;
    }
    public void subir(float x){
        this.preco += x;
    }
     public void descer(float x){
        this.preco -= x;
    }
    public void mostrar(){
        JOptionPane.showMessageDialog(null, "Id: " + this.id + " Descrição: " + this.descricao + 
                " Qtde " + this.qtde + " Preço " + this.preco);
    }
}
