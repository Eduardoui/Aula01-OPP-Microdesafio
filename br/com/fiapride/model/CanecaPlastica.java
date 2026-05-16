package br.com.fiapride.model;

public class CanecaPlastica extends Caneca implements Lavavel {

    private boolean livreBPA;
    public CanecaPlastica(String cor, String tamanho, String material, Dono dono, boolean livreBPA) {

        super(cor, tamanho, material, dono);
        this.livreBPA = livreBPA;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Livre de BPA: " + livreBPA);

    }

    @Override
    public String tipoCaneca(){
        return "Caneca Plástica";
    }

    @Override
    public void lavar() {
        System.out.println("Lavando caneca plástica rapidamente por "
                + TEMPO_LAVAGEM + " minutos.");
    }
}
