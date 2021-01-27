public class TesteCirculo
{
  public static void main (String args[])
  {
    Circulo c1;
    try {
    c1 = new Circulo(-5);
    c1.exibeDados();
    }
    catch (Exception e){
      System.out.println("Erro ao criar circulo:"+e.getMessage());
    }
  }
}
