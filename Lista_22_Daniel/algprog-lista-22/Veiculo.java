public abstract class Veiculo {
    String marca;
    String modelo;
    int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirDetalhes() {
        System.out.println("A Marca: " + marca);
        System.out.println("O Modelo: " + modelo);
        System.out.println("O Ano: " + ano);
    }

    public abstract void acelerar();
}
