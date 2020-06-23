package model;

public class Empreiteiro extends Funcionario {
	private float valorEmpreita;

	public Empreiteiro(int numRegistro, String nome, float valorEmpreita) {
		super(numRegistro, nome);
		this.valorEmpreita = valorEmpreita;		
		// Limite de valor de 50.000 por empreita
		if (valorEmpreita <=0 || valorEmpreita >50000) {
			throw new RuntimeException ("Valor da empreira nao pode ser nulo ou vazio");
		}
	}

	public float calcularSalario() {
		return valorEmpreita;
	}
	
	public float getValorEmpreita() {
		return valorEmpreita;
	}

	public void setValorEmpreita(float valorEmpreita) {
		this.valorEmpreita = valorEmpreita;
	}
}