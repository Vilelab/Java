import java.util.Scanner;
public class URI1001{

  public static void main(String args[]){
    // declarando variáveis
    Scanner teclado = new Scanner(System.in);
    int A, B, X;

    A = teclado.nextInt();
    B = teclado.nextInt();
    X = A + B;

    //saída de dados
    System.out.println("X = "+X);
  }
}
