package br.edu.fatecfranca.exe1;

public class TestaProduto {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Produto obj1 = new Produto(12, 0, "Comida", 5);
        obj1.mostrar();
        obj1.comprar(12);
        obj1.mostrar();
        obj1.vender(3);
        obj1.mostrar();
        obj1.subir(2);
        obj1.mostrar();
        obj1.descer(1);
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
