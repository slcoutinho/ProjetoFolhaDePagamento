package model;

public class Empreiteiro_Isidro extends Funcionario_Isidro {
	private float valorEmpreita;

	public Empreiteiro_Isidro(int numRegistro, String nome, float valorEmpreita) {
		super(numRegistro, nome);
		if (valorEmpreita <= 0) {
			throw new RuntimeException("Valores invalidos para rendimentos do Empreiteiro");
		}
		this.valorEmpreita = valorEmpreita;
	}

	public float calcularSalario() {
		return valorEmpreita;
	}
	
	public float getValorEmpreita() {
		return valorEmpreita;
	}

	public void setValorEmpreita(float valorEmpreita) {
		if (valorEmpreita <= 0) {
			throw new RuntimeException("Valores Invalidos para empreita");
		}
		this.valorEmpreita = valorEmpreita;
	}
}