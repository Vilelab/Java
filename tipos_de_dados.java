import java.util.Scanner;

public class tipos_de_dados{
    public static void main(String args[]){
        int a;        // ocupa 32 bits (4 bytes)
        /*
        float b;      // ocupa 32 bits (4 bytes) ... armazena numeros de ponto flutuante
        double c;     // ocupa 64 bits (16 bytes)... armazena numeros de ponto flutuante
        long d;       // ocupa 64 bits (8 bytes)
        short e;      // ocupa 16 bits (2 bytes)
        byte f;       // ocupa 8  bits (1 byte)
        String g;
        char h;
        */
        // agora vamos trabalhar com o input de dados... veja
        Scanner teclado;
        teclado = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        a = teclado.nextInt();

     /* a = teclado.nextInt();
        b = teclado.nextFloat();
        c = teclado.nextDouble();
        d = teclado.nextLong();
        e = teclado.nextShort();
        f = teclado.nextByte();
        g = teclado.nextLine();
        h = teclado.nextLine().charAt(0); */

        System.out.println("O numero/string digitado eh: " + a);
       
    }
}