import java.util.Scanner;

// programa simples que recebe nome, salario e total de vendas e calcula o salario
// a ser recebido, bem como a comissao do vendedor...
public class URI1009{
    public static void main(String args[]){
        double salario, vendas, total;
        String nome;

        Scanner teclado = new Scanner(System.in);

        nome = teclado.nextLine();
        salario = teclado.nextDouble();
        vendas = teclado.nextDouble();
        total = vendas * 15/100;
        total += salario;

        //printf em java eh o print formatado
        System.out.printf("TOTAL = R$ %.2f\n", total);
    }
}
