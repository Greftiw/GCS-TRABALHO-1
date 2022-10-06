import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Sistema {
	private Operador operador;

	private Scanner in;

	Random gerador = new Random();

	public Sistema() {
		operador = new Operador();
		in = new Scanner(System.in);
	}

	public String[] leArquivo(String nome) {
		String[] linhas = new String[100];
		int contador = 1;
		try {
			FileReader fr;
			fr = new FileReader(nome);
			BufferedReader bf;
			bf = new BufferedReader(fr);
			String linha = bf.readLine();
			linhas[0] = linha;
			while (linha != null) {
				linha = bf.readLine();
				linhas[contador] = linha;
				contador++;
			}
		} catch (Exception e) {
			System.out.println("arquivo não encontrado");
		}
		return linhas;
	}

	public void cadastra() {
		String[] linhas = leArquivo("GSC.txt");
		String id;
		String nome;
		String tipo;
		for (int i = 0; i < 15; i++) {
			id = linhas[i].split(",")[0];
			nome = linhas[i].split(",")[1];
			tipo = linhas[i].split(",")[2];
			Usuario user = new Usuario(id, nome, tipo);

			if (user.getTipo().equals("Medico")) {
				operador.addPacientes((Paciente) user);
			}
		}
	}

	public void menuUser() {
		int opcao = 0;
		do {
			System.out.println("===============================");
			System.out.println("Escolha seu Usuarios");
			System.out.println("[1] Escolher Usuario");
			System.out.println("[2] Ver lista de Usuarios");
			System.out.println("[3] Sair");
			System.out.println("===============================");
			System.out.print("Digite a opcao desejada: ");
			opcao = in.nextInt();
			in.nextLine();
			switch (opcao) {
				case 1:
					System.out.println("Digite seu ID: ");
					Usuario usuario = operador.escolheUser(in.nextLine());
					if (usuario.getTipo().equals("Medico")) {
						menuMedico(usuario, operador);
					}
					if (usuario.getTipo().equals("Paciente")) {
						menuPaciente();
					}
					if (usuario.getTipo().equals("Administrador")) {
						menuADM();
					}
					break;
				case 2:

					break;
				case 3:
					break;
				default:
					System.out.println("Opcao invalida!");

			}
		} while (opcao != 3);
	}

	public void menuMedico(Usuario usuario, Operador listas) {
		System.out.println("Selecione o paciente: ");
		for (Paciente paciente : listas.getPacientes()) {
			System.out.println(paciente.getNome());
		}
		String nome = in.nextLine();
		for (Paciente paciente : listas.getPacientes()) {
			if (paciente.getNome().equals(nome)) {
				System.out.println("por favor digite a data do exame");
				String date = in.nextLine();
				System.out.println("por favor escolha o exame");
				System.out.printf(
						"RaioX /n Tomografia /n Sangue /n Prostata /n Endoscopia /n Colonoscopia /n Fezes /n  Ecocardiografia /n Ultrasonografia /n Eletrocardiograma");
				String exame = in.nextLine();
				paciente.setAuthorizedExams(new Authorization(gerador.nextInt(), date, usuario.getNome(), nome, exame));
				;
			}
		}
	}

	public void menuPaciente() {
		// COMPLETEM COM SUAS TAREFAS
	}

	public void menuADM() {
		// COMPLETEM COM SUAS TAREFAS
	}
}