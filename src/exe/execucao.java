package exe;

import model.pessoa;

public class execucao {
	
	public static void main (String[] args) {
		
		pessoa pessoa = new pessoa();
		pessoa.setNome("Guilherme Ramos");
		pessoa.setEnd("Rua Colonia D'Assun��o");
		pessoa.setBairro("Jardim das Oliveiras");
		pessoa.setCidade("S�o Paulo");
		pessoa.setEstado("S�o Paulo");
		pessoa.setCep(908111230);
		
		pessoa pessoa2 = new pessoa();
		pessoa2.setNome("Rebeca Tavares");
		pessoa2.setEnd("Rua Irineu");
		pessoa2.setBairro("Jardim Helena");
		pessoa2.setCidade("S�o Paulo");
		pessoa2.setEstado("S�o Paulo");
		pessoa2.setCep(999834230);
		
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Endere�o: " + pessoa.getEnd());
		System.out.println("Bairro: " + pessoa.getBairro());
		System.out.println("Cidade: " +pessoa.getCidade());
		System.out.println("Estado: " +pessoa.getEstado());
		System.out.println("CEP: " +pessoa.getCep());
		System.out.println("   ");
		
		System.out.println("Nome: " + pessoa2.getNome());
		System.out.println("Endere�o: " + pessoa2.getEnd());
		System.out.println("Bairro: " + pessoa2.getBairro());
		System.out.println("Cidade: " +pessoa2.getCidade());
		System.out.println("Estado: " +pessoa2.getEstado());
		System.out.println("CEP: " +pessoa2.getCep());
	}

}
