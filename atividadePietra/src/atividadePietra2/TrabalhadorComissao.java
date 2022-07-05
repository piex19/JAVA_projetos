package atividadePietra2;

public class TrabalhadorComissao extends Trabalhador implements Calculo {

	// pago com um salário básico simples mais uma porcentagem sobre o valor dos itens vendidos.
	
	private double salario;
	private double comissao;
	private int itensVT;
	
	public TrabalhadorComissao(String nome, String sobrenome, double salario, double comissao, int itensVT) {
		super(nome, sobrenome);
		this.salario = salario;
		this.comissao = comissao;
		this.itensVT = itensVT;
		// TODO Auto-generated constructor stub
	}

	public double getSalario() {
	return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public int getItensV() {
		return itensVT;
	}
	public void setItensV(int itensV) {
		this.itensVT = itensV;
	}

		@Override
	public String toString() {
		return "TRABALHADOR POR COMISSÃO" + "\nNome: " + getNome() + " " + getSobrenome() + "\nSalário: " + calculo();
	}

		@Override
		public double calculo() {
			// TODO Auto-generated method stub
			return salario + (comissao * itensVT);
	}
	
	
	
	
	
	
	
}
