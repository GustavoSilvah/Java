package br.edu.fatecfranca.exe3;

import javax.swing.JOptionPane;

public class TestaProduto {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int auxId = Integer.parseInt(JOptionPane.showInputDialog("Id: "));
        int auxQtde = Integer.parseInt(JOptionPane.showInputDialog("Quantidade:"));
        String auxDescricao = JOptionPane.showInputDialog("Descrição?");
        float auxPreco = Float.parseFloat(JOptionPane.showInputDialog("Preço: "));
        
        Produto obj1 = new Produto(auxId, auxQtde, auxDescricao, auxPreco);
        obj1.mostrar();
        obj1.comprar(30);
        obj1.mostrar();
        obj1.subir(1);
        obj1.mostrar();
        obj1.vender(3);
        obj1.mostrar();
        
        System.out.println("================================");
        // Teste 2
        Produto obj2 = new Produto(53, 0, "Computador Desktop", 1200);
        obj2.mostrar();
        obj2.comprar(3);
        obj2.mostrar();
        obj2.vender(1);
        obj2.mostrar();
        obj2.subir(2);
        obj2.mostrar();
        obj2.descer(1);
        obj2.mostrar();
    }
    
}
