import java.util.LinkedHashMap;
import java.util.Map;

/** Centro de distribuição com CNPJ, nome e endereço. */
public class CentroDeDistribuicao {
    private String cnpj;
    private String nome;
    private String endereco;

    public CentroDeDistribuicao(String cnpj, String nome, String endereco) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getCnpj() { return cnpj; }
    public String getNome() { return nome; }
    public String getEndereco() { return endereco; }

    /**
     * Recebe vários produtos (varargs) e devolve a soma dos valores agrupada por tipo.
     * Dentro do método, "produtos" é um vetor (Produto[]); sem argumentos, é um vetor vazio.
     */
    public Map<String, Double> somarPorTipo(Produto... produtos) {
        Map<String, Double> totais = new LinkedHashMap<>();
        for (Produto p : produtos) {
            totais.merge(p.getTipo(), p.getValor(), Double::sum);
        }
        return totais;
    }
}
