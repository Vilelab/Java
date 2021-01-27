public class Circulo{
  private double raio;
        
  public Circulo(double r) throws Exception
  {
    setRaio(r);
    // caso a falha se dê no construtor, o objeto não é instanciado
  }
  public void setRaio(double r) throws Exception
  {
    // qual a vantagem de usar exception ao invés de if/else?
    if (r < 0)
      throw new Exception("Circulo com raio negativo");
    else
      raio = r;
  }
  
  public double getRaio()
  {
    return raio;
  }        
        
  public void exibeDados()
  {
    System.out.println("Raio: " + getRaio());
    System.out.println("Diametro: " + calcularDiametro());
    System.out.println("Area: " + calcularArea());
    System.out.println("Circunferencia: " + calcularCircunferencia());
  }
  
  public double calcularDiametro(){
    return raio*2;
  }
  
  public double calcularArea(){
    return 3.14 * raio * raio;
  }
  
  public double calcularCircunferencia(){
    return 2 * 3.14 * raio;
  }
   
}
