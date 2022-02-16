public class Endereco {
    private String rua;
    private int numero;
    private String Bairro;

    public Endereco(String rua, int numero, String bairro) {
        this.rua = rua;
        this.numero = numero;
        Bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }


    public String getBairro() {
        return Bairro;
    }
}
