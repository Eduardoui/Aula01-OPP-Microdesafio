package br.com.fiapride.main;

// Importar classe
import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Caneca;

public class SistemaPrincipal {

	public static void main(String[] args) {
		
		// Exemplo do passageiro
		Passageiro passageiro1 = new Passageiro();
		passageiro1.nome = "Ana Silva";
		passageiro1.saldo = 50.0;

		Passageiro passageiro2 = new Passageiro();
		passageiro2.nome = "Carlos Souza";
		passageiro2.saldo = 12.50;
		
		// Caneca (instância 1)
		Caneca minhaCaneca = new Caneca();
		minhaCaneca.cor = "Rosa";
		minhaCaneca.tamanho = "Pequeno";
		minhaCaneca.material = "Plástico";
		
		// Caneca (instância 2)
		Caneca canecaDaMae = new Caneca();
		canecaDaMae.cor = "Vermelho";
		canecaDaMae.tamanho = "Grande";
		canecaDaMae.material = "Vidro";
		
		
		System.out.println("--- Sistema FiapRide ---");
		System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
		System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);
		System.out.println("A minha caneca é: " + minhaCaneca.cor);
		System.out.println("A da minha mãe é: " + canecaDaMae.cor);
	}
}