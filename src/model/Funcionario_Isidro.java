package model;

public abstract class Funcionario_Isidro {
	protected String nome;
	protected int    numRegistro;
	
	public Funcionario_Isidro(int numRegistro, String nome) {
		if (numRegistro <=0 || nome == null || nome.length() == 0) {
			throw new RuntimeException("Erro. Valores de identificacao do funcionario invalidos");
		}
		this.numRegistro = numRegistro;
		this.nome        = nome;
	}
	
	// aqui defino o "o que" (toda a descendência de Funcionario DEVE ter uma implementação para este método)
	public abstract float calcularSalario();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.length() == 0) {
			throw new RuntimeException("Valor para nome de funcionário Inválido");
		}
		this.nome = nome;
	}

	public int getNumRegistro() {
		return numRegistro;
	}

	public void setNumRegistro(int numRegistro) {
		if (numRegistro <= 0) {
			throw new RuntimeException("Numero de registro invalido");
		}
		this.numRegistro = numRegistro;
	}
}