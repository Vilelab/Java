public class fibonacci{
    // imprime a serie de fibonacci ate passar de 100...
    public static void main(String args[]){
        int i = 0;
        int j = 1;
        int soma = 1;
        System.out.println(i);
        System.out.println(j);
        while(j < 100){
            soma = i + j;
            i = j;
            j = soma;
            System.out.println(soma);
        }
    }
}