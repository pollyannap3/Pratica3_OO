package FolhaDePagamento;

public class MainFolhadePagamento {

	public static void main(String[] args) {
		//Funcionario f1 = new Funcionario(123,"joao", 1000); ele nao deixa criar por ser abstract

		FPadrao fp1 = new FPadrao(100, "Maria",2000);
		System.out.println("Total Proventos: "+fp1.calcularProventos());


		Comissao fc1 = new Comissao(101, "Pedro",2000,1.0,10000);
		System.out.println("Total Proventos: "+fc1.calcularProventos());

		Produtividade fp2 = new Produtividade(102, "Maria",2000,50.0,5);
		System.out.println("Total Proventos: "+fp2.calcularProventos());
		}

}
