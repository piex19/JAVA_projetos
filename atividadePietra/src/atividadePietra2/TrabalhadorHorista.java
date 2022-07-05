package atividadePietra2;

public class TrabalhadorHorista extends Trabalhador implements Calculo {

	// pago por hora com um adicional de hora extra.
	
	private double valorH;
	private int horasT;
	
	public TrabalhadorHorista(String nome, String sobrenome, double valorH, int horasT) {
		super(nome, sobrenome);
		this.valorH = valorH;
		this.horasT = horasT;
		// TODO Auto-generated constructor stub
	}

	public double getValorH() {
		return valorH;
	}
	public void setValorH(double valorH) {
		this.valorH = valorH;
	}

	public int getHorasT() {
		return horasT;
	}
	public void setHorasT(int horasT) {
		this.horasT = horasT;
	}
	
	@Override
	public String toString() {
		return "TRABALHADOR HORISTA" + "\nNome: " + getNome() + " " + getSobrenome() + "\nSalário: " + calculo();
	}

	@Override
	public double calculo() {
		// TODO Auto-generated method stub
		return valorH * horasT;
	}
	
	
	
	
	
	
}
