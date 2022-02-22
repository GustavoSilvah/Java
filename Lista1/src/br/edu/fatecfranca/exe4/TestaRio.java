
package br.edu.fatecfranca.exe4;

import javax.swing.JOptionPane;

public class TestaRio {
    
    public static void main(String[] args) {
        
        String auxNome = JOptionPane.showInputDialog("Nome do Rio:");
        float auxNivel = Float.parseFloat(JOptionPane.showInputDialog("Nível do Rio:"));
        int resp = JOptionPane.showConfirmDialog(null, "O rio está poluído?");
        boolean auxPoluido = (resp == JOptionPane.OK_OPTION);
        
        Rio obj1 = new Rio(auxNome, auxNivel, auxPoluido);
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
