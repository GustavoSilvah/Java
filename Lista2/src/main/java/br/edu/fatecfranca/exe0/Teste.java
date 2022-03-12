package br.edu.fatecfranca.exe0;

public class Teste {
    
    public static void main(String[] args) {
        
        Niver obj1 = new Niver();
        obj1.setDia(8);
        obj1.setMes("Março");
        System.out.println("Dia: " + obj1.getDia() + "Mês: " + obj1.getMes());
        
        Niver obj2 = new Niver();
        obj2.setDia(80);
        obj2.setMes("Outono");
        System.out.println("Dia: " + obj2.getDia() + "Mês: " + obj2.getMes());
        
        Niver obj3 = new Niver();
        obj3.setDia(-10);
        obj3.setMes("Verão");
        System.out.println("Dia: " + obj3.getDia() + "Mês: " + obj3.getMes());
        
        Niver obj4 = new Niver(-8, "Inverno");
        System.out.println("Dia: " + obj4.getDia() + "Mês: " + obj4.getMes());
    }
}
