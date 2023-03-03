package Ikea;

public class Electrodomestico extends ProductoHogar {
    private EficienciaEnergetica eficienciaEnergetica;

    public Electrodomestico(){}

    public Electrodomestico(String nombre, String descripcion, double precio, TipoMaterial tipoMaterial, EficienciaEnergetica eficienciaEnergetica) {
        super(nombre, descripcion, precio, tipoMaterial);
        this.eficienciaEnergetica = eficienciaEnergetica;
    }

    public EficienciaEnergetica getEficienciaEnergetica() {
        return eficienciaEnergetica;
    }

    public void setEficienciaEnergetica(EficienciaEnergetica eficienciaEnergetica) {
        this.eficienciaEnergetica = eficienciaEnergetica;
    }

    @Override
    public String toString() {
        return "Electrodomesticos:" + "\n" +
                super.toString() + "\n" +
                "eficienciaEnergetica = " + this.getEficienciaEnergetica() + "\n";
    }
}
