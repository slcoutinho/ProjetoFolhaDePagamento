package model;

public class Comissionado_Isidro extends Funcionario_Isidro {
	private float salarioBase;
	private float comissao;
	
	
	public Comissionado_Isidro(int numRegistro, String nome, float salarioBase, float comissao) {
		super(numRegistro, nome);
		if (salarioBase <= 0 || comissao < 0) {
			throw new RuntimeException("Valores invalidos para rendimentos do Comissionado");
		}
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}
	
	@Override
	public float calcularSalario() {
		// TODO Auto-generated method stub
		return salarioBase + salarioBase * comissao / 100;
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
	public float getComissao() {
		return comissao;
	}
	public void setComissao(float comissao) {
		if (salarioBase < 0) {
			throw new RuntimeException("Valor inválido para comissao");
		}
		this.comissao = comissao;
	}
}