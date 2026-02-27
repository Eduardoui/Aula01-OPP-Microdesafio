package br.com.fiapride.model;

public class Caneca {

    public String cor;
    public String tamanho;
    public String material;
    private double saldo;

    public Caneca(String cor, String tamanho, String material) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.material = material;
        this.saldo = 0.0;
    }

    public void adicionarValor(double quantidadeAdicionada) {
        if (!isValorValido(quantidadeAdicionada)) return;
        this.saldo += quantidadeAdicionada;
        System.out.println("Valor adicionado: R$" + quantidadeAdicionada + ". Saldo atual: R$" + this.saldo);
    }

    public void processarPagamento(double valorPagamento) {
        if (!isPagamentoValido(valorPagamento)) return;
        this.saldo -= valorPagamento;
        System.out.println("Pagamento realizado: R$" + valorPagamento + ". Saldo restante: R$" + this.saldo);
    }

    public void mostrarInfo() {
        System.out.println("Caneca: " + cor + " | " + tamanho + " | " + material + " | Saldo: R$" + saldo);
    }

    private boolean isValorValido(double quantidadeAdicionada) {
        if (quantidadeAdicionada <= 0) {
            System.out.println("Erro: O valor a ser adicionado deve ser maior que zero.");
            return false;
        }
        return true;
    }

    private boolean isPagamentoValido(double valorPagamento) {
        if (valorPagamento <= 0) {
            System.out.println("Erro: O valor do pagamento deve ser maior que zero.");
            return false;
        }
        if (this.saldo < valorPagamento) {
            System.out.println("Erro: Saldo insuficiente para o pagamento.");
            return false;
        }
        return true;
    }
}