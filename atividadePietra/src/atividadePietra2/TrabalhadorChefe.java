package atividadePietra2;

public class TrabalhadorChefe extends Trabalhador implements Calculo {
	
	// pago com um sal�rio fixo semanal independente do n�mero de horas trabalhadas.
	
	private double salarioSemanal;
	
	public TrabalhadorChefe(String nome, String sobrenome, double salarioSemanal) {
		super(nome, sobrenome);
		this.salarioSemanal = salarioSemanal;
		// TODO Auto-generated constructor stub
	}

	
	public double getSalarioSemanal() {
		return salarioSemanal;
	}
	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}
	
		@Override
		public String toString() {
			return "CHEFE" + "\nNome: " + getNome() + " " + getSobrenome() + "\nSal�rio: " + calculo();
	}
	
		@Override
		public double calculo() {
		// TODO Auto-generated method stub
			return salarioSemanal * 4;
	}
	
	
}
