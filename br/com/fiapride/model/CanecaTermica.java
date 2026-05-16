package br.com.fiapride.model;

public class CanecaTermica extends Caneca implements Lavavel {

    private boolean mantemTemperatura;
    public CanecaTermica(String cor, String tamanho, String material, Dono dono, boolean mantemTemperatura) {

        super(cor, tamanho, material, dono);
        this.mantemTemperatura = mantemTemperatura;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Mantém Temperatura: " + mantemTemperatura);

    }

    @Override
    public String tipoCaneca(){
        return "Caneca Térmica";
    }

    @Override
    public void lavar() {
        System.out.println("Lavando caneca térmica cuidadosamente por "
                + TEMPO_LAVAGEM + " minutos.");
            }
}