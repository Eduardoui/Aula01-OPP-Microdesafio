package br.com.fiapride.main;

import br.com.fiapride.model.Caneca;
import br.com.fiapride.model.Dono;
import br.com.fiapride.model.CanecaTermica;
import br.com.fiapride.model.CanecaPlastica;
import br.com.fiapride.model.Lavavel;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("--- Iniciando o Sistema FiapRide ---\n");

        Dono eduardo = new Dono("Eduardo");
        Dono mae = new Dono("Mãe");

        Caneca minhaCaneca = new CanecaPlastica(
            "Rosa", "Pequena", "Plástico", eduardo, true
        );

        Caneca canecaDaMae = new CanecaTermica(
            "Vermelho", "Grande", "Vidro", mae, false
        );

        CanecaTermica canecaTermica = new CanecaTermica("Preto", "Média", "Aço", eduardo, true);
        CanecaPlastica canecaPlastica = new CanecaPlastica("Azul", "Pequena", "Plástico", mae, true);

        System.out.println(">>> Recarga na minha caneca:");
        minhaCaneca.adicionarValor(50.0);

        System.out.println("\n>>> Recarga na caneca da mãe:");
        canecaDaMae.adicionarValor(100.0);

        System.out.println("\n>>> Recarga na caneca térmica:");
        canecaTermica.adicionarValor(1.0);

        System.out.println("\n>>> Recarga da caneca plástica:");
        canecaPlastica.adicionarValor(2.0);

        System.out.println("\n--- Status das Canecas ---");

        System.out.println(
            "Caneca: " + minhaCaneca.getCor() +
            " | Tamanho: " + minhaCaneca.getTamanho() +
            " | Material: " + minhaCaneca.getMaterial() +
            " | Saldo: R$ " + minhaCaneca.getSaldo() +
            " | Dono da caneca: " + minhaCaneca.getDono().getNome()
        );

        System.out.println(
            "Caneca: " + canecaDaMae.getCor() +
            " | Tamanho: " + canecaDaMae.getTamanho() +
            " | Material: " + canecaDaMae.getMaterial() +
            " | Saldo: R$ " + canecaDaMae.getSaldo() +
            " | Dono da caneca: " + canecaDaMae.getDono().getNome()
        );

        System.out.println("\n--- Realizando Pagamentos ---");

        System.out.println("Pagando da minha caneca...");
        minhaCaneca.processarPagamento(20.0);

        System.out.println("\nPagando da caneca da mãe...");
        canecaDaMae.processarPagamento(120.0);

        System.out.println("\n--- Status Final das Canecas ---");

        minhaCaneca.mostrarInfo();
        canecaDaMae.mostrarInfo();
        
        System.out.println("DEBUG TERMICA");
        canecaTermica.mostrarInfo();
        
        System.out.println("DEBUG PLASTICA");
        canecaPlastica.mostrarInfo();

        System.out.println(canecaTermica.tipoCaneca());
        System.out.println(canecaPlastica.tipoCaneca());

        // Caneca c = new Caneca("Rosa", "Pequena", "Plástico", new Dono("Eduardo"));
        // Error: Caneca is abstract; cannot be instantiated || ERRO: Caneca é abstrata e não pode ser instanciada


    System.out.println("\n--- Lavagem das Canecas ---");
    
    Lavavel[] canecasLavaveis = {
        canecaTermica,
        canecaPlastica
    };
    
    for (Lavavel lavavel : canecasLavaveis) {
        lavavel.lavar();
    }
}

}