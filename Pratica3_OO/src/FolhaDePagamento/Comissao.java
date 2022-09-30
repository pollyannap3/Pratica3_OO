package FolhaDePagamento;

public class Comissao extends Funcionario {
	private Double comissao;
	private int vendas;

	public Comissao(int matricula, String nome, double salario, Double comissao, int vendas) {
		super(matricula, nome, salario);
		this.comissao = comissao;
		this.vendas = vendas;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	public int getVendas() {
		return vendas;
	}

	public void setVendas(int vendas) {
		this.vendas = vendas;
	}
	public double calcularProventos() {
		return getVendas()*getComissao()/100+getSalario();

	}
}
