package br.com.fiapride.model;

public class CanecaTermica extends Caneca {

    private boolean livreBPA;;
    public CanecaTermica(String cor, String tamanhp, Atrong material, Dono dono, boolean livreBPA) {

        super(cor, tamanho, material, dono);
        this.livreBPA = livreBPA;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Livre de BPA:" + livreBPA);

    }
}
