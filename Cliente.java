public class Cliente {
    
  private String nome;
  private double saldo_conta;

  public Cliente(String nome, double saldo_conta) {
    this.nome = nome;
    this.saldo_conta = saldo_conta;
  }

  public double Depositar(double valor) {
    this.saldo_conta = saldo_conta + valor;
    return saldo_conta;
  }

  public void Retirar(double valor) {
    if(saldo_conta < valor){
        System.out.println("ERROR");
    }else{
      this.saldo_conta -= valor;
      System.out.println("Deu certo!");
        }
  }

  public void Imprimir() {
    System.out.println("Nome: " + nome + "Saldo: " + saldo_conta);
    System.out.println();
  };
}