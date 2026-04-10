package br.com.fiapride.model;

public class CanecaTermica extends Caneca {

    private boolean mantemTemperatura;
    public CanecaTermica(String cor, String tamanhp, Atrong material, Dono dono, boolean mantemTemperatura) {

        super(cor, tamanho, material, dono);
        this.mantemTemperatura = mantemTemperatura;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Mantém | Temperatura:" + mantemTemperatura);

    }
}