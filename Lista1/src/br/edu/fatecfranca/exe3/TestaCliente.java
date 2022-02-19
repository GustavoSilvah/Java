package br.edu.fatecfranca.exe3;

public class TestaCliente {
 
    
    public static void main (String[] args) {
        
        Cliente obj1 = new Cliente("Jorge", 212, 03, 600);
        obj1.dadosCliente();
        obj1.realizarDeposito(200);
        obj1.dadosCliente();
        obj1.realizarSaque(300);
        obj1.dadosCliente();
        
        System.out.println("================================");
        // Teste 2
        Cliente obj2 = new Cliente("Beltrano", 315, 06, 1200);
        obj2.dadosCliente();
        obj2.realizarSaque(300);
        obj2.dadosCliente();
        obj2.realizarDeposito(200);;
        obj2.dadosCliente();
        
    }
}
