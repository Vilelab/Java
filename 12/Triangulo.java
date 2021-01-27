import java.lang.Math;
public class Triangulo extends FormaGeometrica
{
  private double base, altura1, altura2, semiperimetro;
  public Triangulo (double base, double altura1, double altura2)
  {
    super.setLados(3);
    setBase(base);
    setAlturaUm(altura1);
    setAlturaDois(altura2);
  }
  
  public void setBase(double base)
  {
    if (base < 0) this.base = 0;
    else this.base = base;
  }
  
  public void setAlturaUm(double altura1)
  {
    if (altura1<0) this.altura1 = 0;
    else this.altura1 = altura1;
  }
  
  public void setAlturaDois(double altura2)
  {
    if (altura2<0) this.altura2 = 0;
    else this.altura2 = altura2;
  }
  
  public double area()
  {
    semiperimetro = (base + altura1 + altura2)/2;
    return Math.sqrt(semiperimetro*(semiperimetro-base)*(semiperimetro-altura1)*(semiperimetro-altura2));
  }
  
  public void imprime()
  {
    System.out.println("Dados do Triangulo");
    super.imprime();
    System.out.println("Base: "+ base);
    System.out.println("Altura 01: "+ altura1);
    System.out.println("Altura 02: "+ altura2);
  }
  
}
