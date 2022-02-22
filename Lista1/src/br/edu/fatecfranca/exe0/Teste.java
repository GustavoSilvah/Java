
package br.edu.fatecfranca.exe0;

import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {
        // TODO code application logic here
        // criar objeto
        String auxModelo = JOptionPane.showInputDialog("Informe o modelo: ");
        int auxAno = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano: "));
        float auxVel = Float.parseFloat(JOptionPane.showInputDialog("Informe a velocidade: "));
        int resp = JOptionPane.showConfirmDialog(null, "Carro está ligado?");
        boolean auxMotor = (resp == JOptionPane.OK_OPTION);
         
        Carro obj1 = new Carro(auxModelo, auxAno, auxVel, auxMotor);
        // chamar os métodos
        obj1.mostrar();
        obj1.ligar();
        obj1.mostrar();
        obj1.acelerar(40);
        obj1.mostrar();
        obj1.frear(10);
        obj1.mostrar();
        obj1.desligar();
        obj1.mostrar();
    
        // treinar: crie um outro obj2 e faça conforme fizemos
        Carro obj2 = new Carro("Palio", 2013, 0, false);
        // chamar os métodos
        obj2.mostrar();
        obj2.ligar();
        obj2.mostrar();
        obj2.acelerar(90);
        obj2.mostrar();
        obj2.frear(30);
        obj2.mostrar();
        obj2.desligar();
        obj2.mostrar();
        
        Carro obj3 = new Carro(); // Exemplo de construtar sem padrão
        obj3.ano = 2019;
        
    }
    
}
