package atividadePietra2;

public class TrabalhadorProducao extends Trabalhador implements Calculo {
	
	// pago pelo número de itens produzidos.
	
	private double valorIten;
	private int itensP;
	
	public TrabalhadorProducao(String nome, String sobrenome, double valorIten, int itensP) {
		super(nome, sobrenome);
		this.valorIten = valorIten;
		this.itensP = itensP;
		// TODO Auto-generated constructor stub
	}
	
	public double getValorIten() {
		return valorIten;
	}
	public void setValorIten(double valorIten) {
		this.valorIten = valorIten;
	}

	public int getItensP() {
		return itensP;
	}
	public void setItensP(int itensP) {
		this.itensP = itensP;
	}
	
	
	@Override
	public String toString() {
		return "TRABALHADOR POR PRODUÇÃO" + "\nNome: " + getNome() + " " + getSobrenome() + "\nSalário: " + calculo();
	}

	@Override
	public double calculo() {
		// TODO Auto-generated method stub
		return valorIten * itensP;
	}
	
	
	
	
	
	
	
	
	
	
}
