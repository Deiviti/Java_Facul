import java.util.ArrayList;

public class Controller {

	private ViewCadContato viewCadContato;
	private ArrayList<Contato> listaCadContato = new ArrayList<>();
	public Controller() {
		viewCadContato = new ViewCadContato();
		trataMenu();
	}

	private void trataMenu() {
		boolean continuar = true;
		do {
			String op = viewCadContato.mostraMenu();

			switch (op) {
			case "1":
				viewCadContato.inserir(listaCadContato);
				break;
			case "2":
				viewCadContato.listar(listaCadContato);
				break;
			case "3":
				viewCadContato.alterar(listaCadContato);
				break;
			case "4":
				viewCadContato.excluir(listaCadContato);
				break;
			case "5":
				viewCadContato.pesquisar(listaCadContato);
				break;
			case "6":
				System.out.println("Aplicação Encerrada \n");
				continuar = false;
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		} while (continuar);
	}
}
