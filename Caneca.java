package br.com.fiapride.model;

public class Caneca {

    private String cor;
    private String tamanho;
    private String material;
    private double saldo;

    public Caneca(String cor, String tamanho, String material) {
        this.setCor(cor);
        this.setTamanho(tamanho);
        this.setMaterial(material);
        this.setSaldo(0);
    }

    public String getCor() {
        return this.cor;
    }

    public String getTamanho() {
        return this.tamanho;
    }

    public String getMaterial() {
        return this.material;
    }

    public double getSaldo() {
        return this.saldo;
    }


    private void setCor(String cor) {
        this.cor = cor;
    }

    private void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    private void setMaterial(String material) {
        this.material = material;
    }

    private void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Erro: saldo não pode ser negativo.");
        }
    }


    public void adicionarValor(double quantidadeAdicionada) {
        if (!isValorValido(quantidadeAdicionada)) return;

        setSaldo(this.saldo + quantidadeAdicionada);

        System.out.println("Valor adicionado: R$" + quantidadeAdicionada +
                ". Saldo atual: R$" + this.saldo);
    }

    public void processarPagamento(double valorPagamento) {
        if (!isPagamentoValido(valorPagamento)) return;

        setSaldo(this.saldo - valorPagamento);

        System.out.println("Pagamento realizado: R$" + valorPagamento +
                ". Saldo restante: R$" + this.saldo);
    }

    public void mostrarInfo() {
        System.out.println("Caneca: " + cor + " | " + tamanho + " | " + material +
                " | Saldo: R$" + saldo);
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