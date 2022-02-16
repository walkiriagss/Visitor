import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeguroVisitorTest {
    @Test
    void deveExibirPessoa() {
        Pessoa pessoa = new Pessoa("111.111.111-11", "Ana",  new Endereco("Rua 1", 20, "Bairro1"));

        SeguroVisitor visitor = new SeguroVisitor();
        assertEquals("Pessoa{cpf=111.111.111-11, nome='Ana', endereco=Rua 1, 20 - Bairro1}", visitor.exibir(pessoa));
    }

    @Test
    void deveExibirVeiculo() {
        Veiculo veiculo = new Veiculo("Chevrolet", "Celta", 20.0);

        SeguroVisitor visitor = new SeguroVisitor();
        assertEquals("Veiculo{marca='Chevrolet', modelo='Celta', preço de tabela=20.0}", visitor.exibir(veiculo));
    }

    @Test
    void deveExibirImovel() {
        Imovel imovel = new Imovel(100, 4, new Endereco("Rua 1", 2, "Bairro1"));

        SeguroVisitor visitor = new SeguroVisitor();
        assertEquals("Imovel{Tamanho em m²=100, quantidade de quartos=4, endereco=Rua 1, 2 - Bairro1}", visitor.exibir(imovel));
    }
}