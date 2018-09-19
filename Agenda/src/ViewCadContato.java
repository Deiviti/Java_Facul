import java.util.ArrayList;
import java.util.Scanner;

public class ViewCadContato {
	
	private Scanner input;
	
	public ViewCadContato() {
		setInput(new Scanner(System.in));
	}
	
	public String mostraMenu() {
		System.out.println("Agenda de Contatos");
		System.out.println("1 - Inserir");
		System.out.println("2 - Listar");
		System.out.println("3 - Alterar");
		System.out.println("4 - Excluir");
		System.out.println("5 - Pesquisar");
		System.out.println("6 - Sair");
		System.out.println("Opção: ");
		System.out.println("\n");
		return input.nextLine();
	}
	
	public Contato inserir(ArrayList<Contato> listaCadContato) {

		Contato contato = new Contato();

		System.out.println("Digite o Nome do Contato: \n");
		contato.setNome(input.nextLine());
		
		System.out.println("Digite a Idade do Contato: \n");
		contato.setIdade(input.nextLine());
		
		System.out.println("Digite o telefone do Contato: \n");
		contato.setTelefone(input.nextLine());

		return contato;
	}
	
	public void listar(ArrayList<Contato> listaCadContato ) {
		for (int x = 0; x < listaCadContato.size(); x++) {
			System.out.println(listaCadContato.get(x).toString() + "Posição: %d - $s" + x);
			System.out.println("\n");
		}
	}
	
	public void alterar(ArrayList<Contato> listaCadContato) {
		listar(listaCadContato);
		boolean continuar = true;
		int x = 0;
		do {
			System.out.println("Digite o código do contato para alterar: ");
			try {
				x = Integer.parseInt(input.nextLine());
				if (x >= 0 & x < listaCadContato.size()) {
					continuar = false;
				} else {
					System.out.println("Digite um valor válido!");
				}
			} catch (Exception e) {
				System.out.println("Valor digitado inválido!!!");
			}
		} while (continuar);

		System.out.println("Nome (" + listaCadContato.get(x).getNome() + "): ");
		listaCadContato.get(x).setNome(input.nextLine());

		System.out.println("Marca(" + listaCadContato.get(x).getIdade() + "): ");
		listaCadContato.get(x).setIdade(input.nextLine());

		System.out.println("Modelo (" + listaCadContato.get(x).getTelefone() + "): ");
		listaCadContato.get(x).setTelefone(input.nextLine());

	}

	public void excluir(ArrayList<Contato> listaCadContato) {
		listar(listaCadContato);
		int x = 0;
		System.out.println("Digite o código do contato para deletar");
		x = Integer.parseInt(input.nextLine());
		listaCadContato.remove(x);
	}

	public void pesquisar(ArrayList<Contato> listaCadContato) {
		boolean flag = true;
		Contato contato = new Contato();
		System.out.println("Digite o nome que deseja pesquisar: ");
		contato.setNome(input.nextLine());

		for (int x = 0; x < listaCadContato.size(); x++) {
			if (listaCadContato.get(x).getNome().equals(contato.getNome()) == true) {
				System.out.println("Nome: " + listaCadContato.get(x).getNome());
				System.out.println("Marca: " + listaCadContato.get(x).getIdade());
				System.out.println("Modelo: " + listaCadContato.get(x).getTelefone());				
				flag = false;
			}
		}

		if (flag == false) {
			System.out.println("Contato Pesquisado");
		}
	}
	
	/**
	 * @return the input
	 */
	public Scanner getInput() {
		return input;
	}

	/**
	 * @param input the input to set
	 */
	public void setInput(Scanner input) {
		this.input = input;
	}

	
}
