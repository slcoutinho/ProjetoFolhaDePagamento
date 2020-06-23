package model;

public class Horista_Isidro extends Funcionario_Isidro {
	
	private int numeroHoras;
	private float valorHora;
	
	public Horista_Isidro(int numRegistro, String nome, int numeroHoras, float valorHora) {
		super(numRegistro, nome);
		if (numeroHoras < 0 || valorHora <=0) {
			throw new RuntimeException("Valores invalidos para rendimentos do Horista");
		}
		this.numeroHoras = numeroHoras;
		this.valorHora = valorHora;
	}
	
	public float calcularSalario() {
		return numeroHoras * valorHora;
	}

	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		if (numeroHoras < 0) {
			throw new RuntimeException("Numero de horas invalido");
		}
		this.numeroHoras = numeroHoras;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		if (valorHora <= 0) {
			throw new RuntimeException("Valor da hora inválido");
		}
		this.valorHora = valorHora;
	}
}