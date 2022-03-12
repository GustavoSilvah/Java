package br.edu.fatecfranca.exe1;

public class Teste {
    
    public static void main(String[] args) {
        
        Cliente obj1 = new Cliente();
        obj1.setNroConta("234786-9");
        obj1.setNroAgencia("1204-6");
        obj1.setNome("José");
        obj1.depositar(20);
        obj1.setSaldo(20);
        obj1.sacar(5);
        obj1.imprimir();
        
        // Acessar as variáveis de instância sem os métodos get e set
        Cliente obj2 = new Cliente("132465-8", "6666-6", "Arnaldo", 2000);
        obj2.sacar(1000);
        obj2.imprimir();
        //System.out.println(obj2.toString());
        
    }
}
