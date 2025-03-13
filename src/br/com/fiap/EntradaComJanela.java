package br.com.fiap;

import javax.swing.*;

public class EntradaComJanela {
    public static void main(String[] args) {
        //declaração e inicialização das variáveis e objetos
        int num1 = 0, num2 = 0, resultado = 0;
        String auxiliar;
        try {
            auxiliar = JOptionPane.showInputDialog("Digite um número");
            num1 = Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite outro número");
            resultado = num1 + num2;
            JOptionPane.showMessageDialog(null,"resultado: " + resultado);
        } catch (Exception e) {
           JOptionPane.showInputDialog(null, "Formato incorreto");
        }
    }
}
