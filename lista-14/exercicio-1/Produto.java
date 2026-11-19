/** Produto com identificador, nome, tipo e valor. */
public class Produto {
    private int id;
    private String nome;
    private String tipo;
    private double valor;

    public Produto(int id, String nome, String tipo, double valor) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getTipo() { return tipo; }
    public double getValor() { return valor; }
}
