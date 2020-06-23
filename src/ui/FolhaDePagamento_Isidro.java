package ui;

import java.util.ArrayList;
import java.util.Scanner;

import model.*;

public class FolhaDePagamento_Isidro {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Funcionario_Isidro> lista;

		lista = new ArrayList<Funcionario_Isidro>();
		int N, opcao;
		String nome;
		int nreg, nhoras;
		float valor1, valor2, valor3;

		System.out.println("Quantos funcionarios a cadastrar?");
		N = Integer.parseInt(teclado.nextLine());

		try {
			for (int i = 0; i < N; i++) {
				System.out.println("Digite 1- Chefe/ 2- Comissionado/ 3- Horista/ 4- Empreiteiro");
				opcao = Integer.parseInt(teclado.nextLine());
				switch (opcao) {
				case 1:
					System.out.println("Digite o numero de registro");
					nreg = Integer.parseInt(teclado.nextLine());
					System.out.println("Digite o nome");
					nome = teclado.nextLine();
					System.out.println("Digite o salario base, adicional e beneficio");
					valor1 = Float.parseFloat(teclado.nextLine());
					valor2 = Float.parseFloat(teclado.nextLine());
					valor3 = Float.parseFloat(teclado.nextLine());
					Funcionario_Isidro chefe = new Chefe_Isidro(nreg, nome, valor1, valor2, valor3);
					lista.add(chefe);
					break;
				case 2:
					System.out.println("Digite o numero de registro");
					nreg = Integer.parseInt(teclado.nextLine());
					System.out.println("Digite o nome");
					nome = teclado.nextLine();
					System.out.println("Digite o salario base e comissao");
					valor1 = Float.parseFloat(teclado.nextLine());
					valor2 = Float.parseFloat(teclado.nextLine());
					Funcionario_Isidro comiss = new Comissionado_Isidro(nreg, nome, valor1, valor2);
					lista.add(comiss);
					break;

				case 3:
					System.out.println("Digite o numero de registro");
					nreg = Integer.parseInt(teclado.nextLine());
					System.out.println("Digite o nome");
					nome = teclado.nextLine();
					System.out.println("Digite o numero de horas e o valor da hora");
					nhoras = Integer.parseInt(teclado.nextLine());
					valor1 = Float.parseFloat(teclado.nextLine());
					Funcionario_Isidro hr = new Horista_Isidro(nreg, nome, nhoras, valor1);
					lista.add(hr);
					break;
				case 4:
					System.out.println("Digite o numero de registro");
					nreg = Integer.parseInt(teclado.nextLine());
					System.out.println("Digite o nome");
					nome = teclado.nextLine();
					System.out.println("Digite o valor da empreita");
					valor1 = Float.parseFloat(teclado.nextLine());
					Funcionario_Isidro empr = new Empreiteiro_Isidro(nreg, nome, valor1);
					lista.add(empr);
					break;
				default:
					System.out.println("Opcao invalida");
					break;
				}
			}
			/*
			 * lista.add(new Chefe(1,"Mario",5000.0f, 10.0f, 800.0f)); lista.add(new
			 * Comissionado(2, "Jose", 1000.0f, 22.5f)); lista.add(new Horista(3, "Ana",
			 * 100, 82.50f)); lista.add(new Horista(4, "Paulo", 80, 75.0f)); lista.add(new
			 * Empreiteiro(5, "Carla", 5500.0f)); lista.add(new Empreiteiro(6, "Altair",
			 * 2300.0f));
			 */

			System.out.println("REG   NOME                  SALARIO R$ ");
			for (Funcionario_Isidro f : lista) {
				System.out.printf("%3d", f.getNumRegistro());
				System.out.printf("   %-23s", f.getNome());
				System.out.printf("%.2f\n", f.calcularSalario());
				System.out.println(f.getClass().getName());
			}
		} catch (Exception ex) {
			System.out.println("Erro ao cadastrar funcionarios");
			System.out.println("MOTIVO: "+ex.getMessage());
		}
		teclado.close();
	}
}