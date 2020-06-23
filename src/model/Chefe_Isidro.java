package model;

public class Chefe_Isidro extends Funcionario_Isidro {
	private float salarioBase;
	private float adicionalFuncao;
	private float beneficioTerno;
	
	public Chefe_Isidro(int numRegistro, String nome, float salarioBase, float adicionalFuncao, float beneficioTerno) {
		super(numRegistro, nome);
		if (salarioBase <=0 || adicionalFuncao <= 0 || beneficioTerno <= 0) {
			throw new RuntimeException("Valores para rendimento inválidos");
		}
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno;
	}
	
	// aqui defino o "como", ou seja, assumo a responsabilidade de implementar a lógica definida no método abstrato da classe-pai
	public float calcularSalario() {
		return salarioBase + salarioBase*adicionalFuncao/100 + beneficioTerno;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		if (salarioBase <= 0) {
			throw new RuntimeException("Valor inválido para salario base");
		}
		this.salarioBase = salarioBase;
	}

	public float getAdicionalFuncao() {
		return adicionalFuncao;
	}

	public void setAdicionalFuncao(float adicionalFuncao) {
		if (adicionalFuncao <= 0) {
			throw new RuntimeException("Valor inválido para Adicional de Funcao");
		}
		this.adicionalFuncao = adicionalFuncao;
	}

	public float getBeneficioTerno() {
		return beneficioTerno;
	}

	public void setBeneficioTerno(float beneficioTerno) {
		if (beneficioTerno <= 0) {
			throw new RuntimeException("Valor inválido para Benefício");
		}
		this.beneficioTerno = beneficioTerno;
	}
}