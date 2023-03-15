class Banco{
  public static void main(String[] args){
    Cliente c1 = new Cliente("Jandira	Silva", 2500);
    Cliente c2 = new Cliente("Sandra Rodrigues", 1800);
    Cliente c3 = new Cliente("Luciana Teixeira", 5000);

    c1.Imprimir();
    c2.Imprimir();
    c3.Imprimir();
  }
}