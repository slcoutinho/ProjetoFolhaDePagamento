package model;

public class Horista extends Funcionario {

	private int numeroHoras;
	private float valorHora;

	public Horista(int numRegistro, String nome, int numeroHoras, float valorHora) {
		super(numRegistro, nome);
		this.numeroHoras = numeroHoras;
		this.valorHora = valorHora;
	}
	// Tratativa HE
	public void setHoraExtra (float hExtra) {
		if (numeroHoras > 6) {
			throw new RuntimeException("Nao pode gerar HE bacana!");
		}
	}
	
	public float calcularSalario() {
		return numeroHoras * valorHora;
	}

	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
}