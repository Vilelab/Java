public class Caminhao extends Veiculo {
  private int capacidade;
  private int numDeEixos;
  
  public Caminhao(String modelo, String placa, int anoFabr, int capacidade, int numDeEixos, double valor){
    super (modelo, placa, anoFabr, valor);
    setCapacidade(capacidade);
    setNumDeEixos(numDeEixos);
  }
  public void setCapacidade(int capacidade){
    this.capacidade = capacidade;
  }
  
  public int getCapacidade(){
    return capacidade;
  }
  
  public void setNumDeEixos(int numDeEixos){
    this.numDeEixos = numDeEixos;
  }
  
  public int getNumDeEixos(){
    return numDeEixos;
  }
  
  // é necessario # (protected) para que carro use imprime de veiculo
  public void imprime(){
    System.out.printf("\nVeiculo: %s\nPlaca: %7s", modelo, placa);
    System.out.printf("\nFabr: %4d\nNum de eixos: %4d", anoFabr, numDeEixos);
    System.out.printf("\nCapacidade %4d\nValor: R$ %.2f\n", capacidade, valor);
  }
}
