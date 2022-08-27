package leads;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opc;
		String nome, tel, nasc, cpf, email, curso;
		Lista novaLista = new Lista();
		lead novoLead = new lead();
		Scanner teclado;
		
		//Construindo o teclado:
		teclado = new Scanner(System.in);
		
		do {
			System.out.println("\n------------------------");
			System.out.println("        MENU");
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Cadastrar novo lead");
			System.out.println("2 - Lista de leads");
			System.out.println("0 - Sair");
			
			opc = teclado.nextInt();
			teclado.nextLine(); //Limpar o buffer
			
			switch(opc) {
			case 1:
				//Leitura dos dados:
				System.out.println("Nome: ");
				nome = teclado.nextLine();
				System.out.println("Telefone: ");
				tel = teclado.nextLine();
				System.out.println("Data de Nascimento: ");
				nasc = teclado.nextLine();
				System.out.println("CPF: ");
				cpf = teclado.nextLine();
				System.out.println("Email: ");
				email = teclado.nextLine();
				System.out.println("Curso de Interesse: ");
				curso = teclado.nextLine();
				
				//Construir um cadastro:
				novoLead = new lead(nome, tel, nasc, cpf, email, curso);
				
				novaLista.inserelead(novoLead);
				
				break;
			case 2:
				novaLista.listarLeads();
				break;
			case 0:
				System.out.println("Saindo...");
			default:
				System.out.println("Opção Inválida.");
			}
		} while(opc != 0);

	}

}
