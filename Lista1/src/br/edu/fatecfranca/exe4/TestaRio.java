
package br.edu.fatecfranca.exe4;

public class TestaRio {
    
    public static void main(String[] args) {
        
        Rio obj1 = new Rio("Maria", 800, true);
        obj1.chover(0);
        obj1.mostrar();
        obj1.sujar();
        
        System.out.println("================================");
        // Teste 2
        Rio obj2 = new Rio("Nilo", 2830, true);
        obj2.chover(0);
        obj2.mostrar();
        obj2.limpar();
    }
}
