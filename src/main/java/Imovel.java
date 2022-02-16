public class Imovel implements Seguro{
    private int tamanho;
    private int quantQuartos;
    private Endereco endereco;

    public Imovel(int tamanho, int quantQuartos, Endereco endereco) {
        this.tamanho = tamanho;
        this.quantQuartos = quantQuartos;
        this.endereco = endereco;
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getQuantQuartos() {
        return quantQuartos;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public String aceitar(Visitor visitor) {
        return visitor.exibirImovel(this);
    }

}
