public class Veiculo implements Seguro{
    private String marca;
    private String modelo;
    private double precoTabela;

    public Veiculo(String marca, String modelo,double precoTabela) {
        this.marca = marca;
        this.modelo = modelo;
        this.precoTabela = precoTabela;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecoTabela() {
        return precoTabela;
    }
    public String aceitar(Visitor visitor) {
        return visitor.exibirVeiculo(this);
    }

}
