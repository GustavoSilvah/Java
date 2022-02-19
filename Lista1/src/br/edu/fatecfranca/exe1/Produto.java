package br.edu.fatecfranca.exe1;
public class Produto {
    int id, qtde;
    String descricao;
    float preco;
    
    public Produto(){
        
    }
    public Produto(int i, int qt, String de, float pr){
        id = i;
        qtde = qt;
        descricao = de;
        preco = pr;
    }
    public void comprar(int x){
        qtde += x;
    }
    public void vender(int x){
        qtde -= x;
    }
    public void subir(float x){
        preco += x;
    }
     public void descer(float x){
        preco -= x;
    }
    public void mostrar(){
        System.out.println("Id: " + id + " Descrição: " + descricao + 
                " Qtde " + qtde + " Preço " + preco);
    }
}
