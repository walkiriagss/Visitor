public class Pessoa implements Seguro{

    private String CPF;
    private String nome;
    private Endereco endereco;

    public Pessoa(String CPF, String nome, Endereco endereco) {
        this.CPF = CPF;
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getCPF() {
        return CPF;
    }
    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirPessoa(this);
    }
}
