package br.com.fiapride.main;
import br.com.fiapride.model.Caneca;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("--- Sistema FiapRide ---");

        Caneca minhaCaneca = new Caneca("Rosa", "Pequena", "Plástico");
        Caneca canecaDaMae = new Caneca("Vermelho", "Grande", "Vidro");

        minhaCaneca.adicionarValor(50);
        canecaDaMae.adicionarValor(100);

        minhaCaneca.processarPagamento(20);
        canecaDaMae.processarPagamento(120);

        minhaCaneca.mostrarInfo();
        canecaDaMae.mostrarInfo();
    }
}