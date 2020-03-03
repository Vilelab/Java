import java.util.Scanner;
public class URI1002{

  public static void main(String args[]){
    // declarando variáveis
    Scanner teclado = new Scanner(System.in);
    double A, n, r;
    n = 3.14159;

    r = teclado.nextDouble();
    A = n * r*r;

    //saída de dados
    System.out.printf("A=%.4f\n", A);
  }
}

