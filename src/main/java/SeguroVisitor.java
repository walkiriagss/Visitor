public class SeguroVisitor implements Visitor{

    public String exibir(Seguro seguro) {
        return seguro.aceitar(this);
    }

    @Override
    public String exibirPessoa(Pessoa pessoa) {
        return "Pessoa{" +
                "cpf=" + pessoa.getCPF() +
                ", nome='" + pessoa.getNome() + '\'' +
                ", endereco=" + pessoa.getEndereco().getRua() + ", " +pessoa.getEndereco().getNumero() + " - "+pessoa.getEndereco().getBairro()+                 '}';
    }

    @Override
    public String exibirVeiculo(Veiculo veiculo) {
        return "Veiculo{" +
                "marca='" + veiculo.getMarca() +'\'' +
                ", modelo='" + veiculo.getModelo() + '\'' +
                ", preço de tabela=" + veiculo.getPrecoTabela() +
                '}';
    }

    @Override
    public String exibirImovel(Imovel imovel) {
        return "Imovel{" +
                "Tamanho em m²=" + imovel.getTamanho()+
                ", quantidade de quartos=" + imovel.getQuantQuartos()  +
                ", endereco=" + imovel.getEndereco().getRua() + ", " +imovel.getEndereco().getNumero() + " - "+imovel.getEndereco().getBairro() +
                '}';
    }

}
