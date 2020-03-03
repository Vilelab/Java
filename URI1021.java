// dado um valor a ser sacado, o programa calcula a quantidade minima de notas necessaria
// para efetuar o saque

import java.util.Scanner;

public class URI1021{
    public static void main(String args[]){

        // declaracao das variaveis
        double valor, centavos;
        int notas100, notas50, notas20, notas10, notas5, notas2, resto;
        int moedas1, moedas50, moedas25, moedas10, moedas05, moedas01;
        
        // input de dados
        Scanner teclado = new Scanner(System.in);
        valor = teclado.nextDouble();

        // processamento...
        System.out.println("NOTAS:");
        notas100 = (int) valor / 100;
        resto = (int) valor % 100;
        System.out.println(notas100 + " nota(s) de R$ 100.00");

        notas50 = resto / 50;
        resto = resto % 50;
        System.out.println(notas50 + " nota(s) de R$ 50.00");

        notas20 = resto / 20;
        resto = resto % 20;
        System.out.println(notas20 + " nota(s) de R$ 20.00");

        notas10 = resto / 10;
        resto = resto % 10;
        System.out.println(notas10 + " nota(s) de R$ 10.00");

        notas5 = resto / 5;
        resto = resto % 5;
        System.out.println(notas5 + " nota(s) de R$ 5.00");

        notas2 = resto / 2;
        resto = resto % 2;
        System.out.println(notas2 + " nota(s) de R$ 2.00");

        centavos = valor - (int) valor;
        centavos *= 100;

        System.out.println("MOEDAS:");
        moedas1 = resto / 1;
        System.out.println(moedas1 + " moeda(s) de R$ 1.00");

        moedas50 = (int) centavos / 50;
        resto = (int) centavos % 50;
        System.out.println(moedas50 + " moeda(s) de R$ 0.50");

        moedas25 = resto / 25;
        resto = resto % 25;
        System.out.println(moedas25 + " moeda(s) de R$ 0.25");

        moedas10 = resto / 10;
        resto = resto % 10;
        System.out.println(moedas10 + " moeda(s) de R$ 0.10");

        moedas05 = resto / 5;
        resto = resto % 5;
        System.out.println(moedas05 + " moeda(s) de R$ 0.05");

        moedas01 = resto / 1;
        System.out.println(moedas01 + " moeda(s) de R$ 0.01");

    }
}