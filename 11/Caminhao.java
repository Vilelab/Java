public class Caminhao extends Veiculo {
  private double capacidade;
  private int numEixos;
  
  public Caminhao(String modelo, String placa, int anoFabr, double capacidade, int numEixos, double valor){
    super (modelo, placa, anoFabr, valor);
    setCapacidade(capacidade);
    setNumEixos(numEixos);
  }
  public void setCapacidade(double capacidade){
    this.capacidade = capacidade;
  }
  
  public double getCapacidade(){
    return capacidade;
  }
  
  public void setNumEixos(int numEixos){
    this.numEixos = numEixos;
  }
  
  public int getNumEixos(){
    return numEixos;
  }
  
  // é necessario # (protected) para que carro use imprime de veiculo
  public void imprime(){
    System.out.printf("\nVeiculo: %s\nPlaca: %7s", modelo, placa);
    System.out.printf("\nFabr: %4d\nNum de eixos: %4d", anoFabr, numEixos);
    System.out.printf("\nCapacidade %.4f\nValor: R$ %.2f\n", capacidade, valor);
  }
}
