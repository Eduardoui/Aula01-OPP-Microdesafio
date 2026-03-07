package br.com.fiapride.main;

import br.com.fiapride.model.Caneca;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("--- Iniciando o Sistema FiapRide ---\n");

        Caneca minhaCaneca = new Caneca("Rosa", "Pequena", "Plástico");
        Caneca canecaDaMae = new Caneca("Vermelho", "Grande", "Vidro");

        System.out.println(">>> Recarga na minha caneca:");
        minhaCaneca.adicionarValor(50.0);

        System.out.println("\n>>> Recarga na caneca da mãe:");
        canecaDaMae.adicionarValor(100.0);

        System.out.println("\n--- Status das Canecas ---");

        System.out.println(
            "Caneca: " + minhaCaneca.getCor() +
            " | Tamanho: " + minhaCaneca.getTamanho() +
            " | Material: " + minhaCaneca.getMaterial() +
            " | Saldo: R$ " + minhaCaneca.getSaldo()
        );

        System.out.println(
            "Caneca: " + canecaDaMae.getCor() +
            " | Tamanho: " + canecaDaMae.getTamanho() +
            " | Material: " + canecaDaMae.getMaterial() +
            " | Saldo: R$ " + canecaDaMae.getSaldo()
        );

        System.out.println("\n--- Realizando Pagamentos ---");

        System.out.println("Pagando da minha caneca...");
        minhaCaneca.processarPagamento(20.0);

        System.out.println("\nPagando da caneca da mãe...");
        canecaDaMae.processarPagamento(120.0);

        System.out.println("\n--- Status Final das Canecas ---");

        minhaCaneca.mostrarInfo();
        canecaDaMae.mostrarInfo();
    }
}