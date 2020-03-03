public class fatorial {
    //Pergunta: por que não funciona para valores muito altos?
    public static void main(String args[]){
        int i;
        int fat = 0;
        int num = fat;

	Scanner teclado = new Scanner(System.in);
	System.out.println("Digite o valor a ser calculado: ");
	num = teclado.nextInt();

        if (num == 0){
            System.out.println("Fatorial vale 1");
            System.exit(1);
        }
        else{
            for(i = 1; i < num; i++){
                fat *=  i;
            }
            System.out.println(fat);
        }
    }
}
