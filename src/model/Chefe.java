package model;

public class Chefe extends Funcionario {
	private float salarioBase;
	private float adicionalFuncao;
	private float beneficioTerno;
	
	public Chefe(int numRegistro, String nome, float salarioBase, float adicionalFuncao, float beneficioTerno) {
		super(numRegistro, nome);
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno;
		// Tratativa salarioBase
		if (salarioBase <=0) {
			throw new RuntimeException ("Salario Base nao pode ser negativo ou vazio");
		}
		// Tratativa adicionalFuncao
		if (adicionalFuncao <=0 || adicionalFuncao == 1000) {
			throw new RuntimeException ("Valor do adicional funcao nao pode ser: negativo ou = 1000");
		}
		// Tratativa beneficioTerno
		if (beneficioTerno <=0 || beneficioTerno == 100) {
			throw new RuntimeException ("Valor do beneficio terno nao esta dentro da politica (R$ 100,00)");
		}
	}
	
	// aqui defino o "como", ou seja, assumo a responsabilidade de implementar a lógica definida no método abstrato da classe-pai
	public float calcularSalario() {
		return salarioBase + salarioBase*adicionalFuncao/100 + beneficioTerno;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getAdicionalFuncao() {
		return adicionalFuncao;
	}

	public void setAdicionalFuncao(float adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}

	public float getBeneficioTerno() {
		return beneficioTerno;
	}

	public void setBeneficioTerno(float beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}
}
