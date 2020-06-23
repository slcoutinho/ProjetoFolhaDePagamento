package ui;

import java.util.ArrayList;
import model.*;

public class FolhaDePagamento {
	public static void main(String args[]) {

		ArrayList<Funcionario> lista;

		lista = new ArrayList<Funcionario>();
		
		// numRegistro, nome, salarioBase, adicionalFuncao, beneficioTerno
		lista.add(new Chefe(1, "Mario", 5000.0f, 100.0f, 1000.0f));
		
		// numRegistro, nome, salarioBase, comissao
		lista.add(new Comissionado(2, "Jose", 1000.0f, 22.5f));
		
		// numRegistro, nome, numeroHoras, valorHora
		lista.add(new Horista(3, "Ana", 100, 82.50f));
		lista.add(new Horista(4, "Paulo", 80, 75.0f));
		
		// numRegistro, nome, valorEmpreita
		lista.add(new Empreiteiro(5, "Carla", 5500.0f));
		lista.add(new Empreiteiro(6, "Altair", 2300.0f));

		System.out.println("REG   NOME                  SALARIO R$ ");
		for (Funcionario f : lista) {
			System.out.printf("%3d", f.getNumRegistro());
			System.out.printf("   %-23s", f.getNome());
			System.out.printf("%.2f\n", f.calcularSalario());
			System.out.println(f.getClass().getName());
		}
	}
}