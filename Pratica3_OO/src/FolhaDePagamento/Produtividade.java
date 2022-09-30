package FolhaDePagamento;

public class Produtividade extends Funcionario{
	private Double valor;
	private int produtividade;

	public Produtividade(int matricula, String nome, double salario, Double valor, int produtividade) {
		super(matricula, nome, salario);
		this.valor = valor;
		this.produtividade = produtividade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public int getProdutividade() {
		return produtividade;
	}

	public void setProdutividade(int produtividade) {
		this.produtividade = produtividade;
	}

	public double calcularProventos() {
		return getValor()*getProdutividade()+getSalario();
		
	}
}
