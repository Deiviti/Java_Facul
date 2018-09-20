import java.util.ArrayList;
import java.util.Scanner;

public class ViewCadContato {
	
	Scanner teclado = new Scanner(System.in);
	private ArrayList<Contato> viewCadContato;
	public ViewCadContato() {
		setInput(new Scanner(System.in));
	}
	
	private void setInput(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}

	public String mostraMenu(int tam) {		
		System.out.println("\n");
		System.out.println("Agenda de Contatos");
		System.out.println("\n");
		System.out.println("Cadastros realizados até o momento: \n" + tam);
		System.out.println("1 - Incluir");
		System.out.println("2 - Listar");
		System.out.println("3 - Alterar");
		System.out.println("4 - Excluir");
		System.out.println("5 - Pesquisar");
		System.out.println("6 - Sair");
		System.out.println("Opção: ");
		System.out.println("\n");
		return teclado.nextLine();
	}
	
	public Contato incluir(ArrayList<Contato> listaCadContato) {

		Contato contato = new Contato();
		System.out.println("Digite o Nome do Contato: \n");		
		contato.setNome(teclado.nextLine());		
		System.out.println("Digite a Idade do Contato: \n");		
		contato.setIdade(teclado.nextLine());		
		System.out.println("Digite o telefone do Contato: \n");		
		contato.setTelefone(teclado.nextLine());	
		System.out.println("Digite a Altura do Contato: \n");
		String alturaSTR = teclado.nextLine();
		contato.setAltura(Float.valueOf(alturaSTR));
		listaCadContato.add(contato);
		System.out.println("Digite Enter para seguir !!");
		teclado.nextLine();
		return contato;		
	}
	
	public void listar(ArrayList<Contato> listaCadContato ) {
		int ct = listaCadContato.size();
		for (int x = 0; x < ct; x++) {
			System.out.printf("Código Contato %d - %s\n", x, listaCadContato.get(x));
			System.out.println("\n");	
			System.out.println("Digite Enter para seguir !!");
			teclado.nextLine();
		}
	}
	
	public void alterar(ArrayList<Contato> listaCadContato) {
		listar(listaCadContato);
		boolean continuar = true;
		int x = 0;
		do {
			System.out.println("Digite o código do contato para alterar: ");
			try {
				x = Integer.parseInt(teclado.nextLine());
				
				if (x >= 0 & x < listaCadContato.size()) {
					continuar = false;
				} else {
					System.out.println("Digite um valor válido!");
				}
			} catch (Exception e) {
				System.out.println("Valor digitado inválido!!!");
			}
			
		} while (continuar);
		
		System.out.println("Digite Enter para seguir !!");		
		teclado.nextLine();
		System.out.println("Realize a alteração no Contato !!\n");
		
		System.out.println("Nome (" + listaCadContato.get(x).getNome() + "): ");
		listaCadContato.get(x).setNome(teclado.nextLine());

		System.out.println("Idade(" + listaCadContato.get(x).getIdade() + "): ");
		listaCadContato.get(x).setIdade(teclado.nextLine());

		System.out.println("Telefone (" + listaCadContato.get(x).getTelefone() + "): ");
		listaCadContato.get(x).setTelefone(teclado.nextLine());
		
		System.out.println("Altura (" + listaCadContato.get(x).getAltura() + "): ");
		listaCadContato.get(x).setAltura(teclado.nextLine());
		
		System.out.println("Digite Enter para seguir !!");
		teclado.nextLine();
		System.out.println("Alteração realizada com Sucesso !!");
		System.out.println("Nome: " + listaCadContato.get(x).getNome());
		System.out.println("Idade: " + listaCadContato.get(x).getIdade());
		System.out.println("Telefone: " + listaCadContato.get(x).getTelefone());
		System.out.println("Altura: " + listaCadContato.get(x).getAltura());
		System.out.println("\n\n");
		System.out.println("Digite Enter para seguir !!");
		teclado.nextLine();

	}

	public void excluir(ArrayList<Contato> listaCadContato) {
		listar(listaCadContato);			
		System.out.println("Deseja realmente excluir um cadastro?");
	    System.out.println("Se SIM digite - 1\n\nSe NÃO digite - 2");
	    String op = teclado.nextLine();
	    
	    switch(op) {
	    case "1":
	    	System.out.println("\n\n");
			System.out.println("Digite o Código da pessoa a ser excluída:");
			int delete = teclado.nextInt();												
			listaCadContato.remove(delete);
	    	break;
	    case "2":
	    	
	    	break;
	    }    						
		
	}

	public void pesquisar(ArrayList<Contato> listaCadContato) {
		boolean flag = true;
		Contato contato = new Contato();
		System.out.println("Digite o nome que deseja pesquisar: \n\n");
		contato.setNome(teclado.nextLine());

		for (int x = 0; x < listaCadContato.size(); x++) {
			if (listaCadContato.get(x).getNome().equals(contato.getNome()) == true) {
				System.out.println("Nome: " + listaCadContato.get(x).getNome());
				System.out.println("Idade: " + listaCadContato.get(x).getIdade());
				System.out.println("Telefone: " + listaCadContato.get(x).getTelefone());
				System.out.println("Altura: " + listaCadContato.get(x).getAltura());
				flag = false;
				
			}
		}

		if (flag == false) {
			System.out.println("Contato Pesquisado \n");
			System.out.println("Digite Enter para seguir !!");
			teclado.nextLine();
		}
	}

	/**
	 * @return the viewCadContato
	 */
	public ArrayList<Contato> getViewCadContato() {
		return viewCadContato;
	}

	/**
	 * @param viewCadContato the viewCadContato to set
	 */
	public void setViewCadContato(ArrayList<Contato> viewCadContato) {
		this.viewCadContato = viewCadContato;
	}
	
	
}
