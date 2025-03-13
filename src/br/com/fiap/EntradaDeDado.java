package br.com.fiap;

import java.util.Scanner;

public class EntradaDeDado {
    public static void main(String[] args) {
        //declaração e inicialização (opcional) das variáveis e objetos
        int num1 = 0, num2 = 0, resultado = 0;
        Scanner scan; //declaração do objeto scan
        try {
            scan = new Scanner(System.in); //instanciação do objeto scan
            System.out.println("Digite dois números inteiros");
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            resultado = num1 + num2;
            System.out.printf("Seu resultado foi: %d", resultado);
        } catch (Exception e) {
            System.out.println("Formato de número incorreto!");

        }

    }
}
