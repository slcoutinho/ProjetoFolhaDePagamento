package model;

public abstract class Funcionario {
	protected String nome;
	protected int    numRegistro;
	
	public Funcionario(int numRegistro, String nome) {
		if (numRegistro <=0 || nome == null || nome.length() == 0) {
			throw new RuntimeException ("Informacoes do funcionario invalidas");
		}
		this.numRegistro = numRegistro;
		this.nome        = nome;
	}
	
	// aqui defino o "o que" (toda a descend�ncia de Funcionario DEVE ter uma implementa��o para este m�todo)
	public abstract float calcularSalario();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.length() == 0) {
			throw new RuntimeException ("Nome invalido");
		}
		this.nome = nome;
	}

	public int getNumRegistro() {
		return numRegistro;
	}

	public void setNumRegistro(int numRegistro) {
		if (numRegistro <= 0) {
			throw new RuntimeException ("Registro invalido");
		}
		this.numRegistro = numRegistro;
	}
}