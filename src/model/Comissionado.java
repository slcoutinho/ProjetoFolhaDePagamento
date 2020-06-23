package model;

public class Comissionado extends Funcionario {
	private float salarioBase;
	private float comissao;
	
	
	public Comissionado(int numRegistro, String nome, float salarioBase, float comissao) {
		super(numRegistro, nome);
		// Tratativa comissao
		if (comissao <=0 || comissao > 1000) {
			throw new RuntimeException ("Valor da comissao nao esta dentro da politica ( >1000 )");
		}
		// Tratativa salarioBase
		if (salarioBase <=0) {
			throw new RuntimeException ("Salario Base nao pode ser negativo ou vazio");
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
		this.salarioBase = salarioBase;
	}
	public float getComissao() {
		return comissao;
	}
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
}
