package Ikea;

public class Mueble extends ProductoHogar{
    private String tipoMueble;

    public Mueble(){}

    public Mueble(String nombre, String descripcion, double precio, TipoMaterial tipoMaterial, String tipoMueble) {
        super(nombre, descripcion, precio, tipoMaterial);
        this.tipoMueble = tipoMueble;
    }

    public String getTipoMueble() {
        return tipoMueble;
    }

    public void setTipoMueble(String tipoMueble) {
        this.tipoMueble = tipoMueble;
    }

    @Override
    public String toString() {
        return "Mueble:" + "\n" +
                super.toString() + "\n" +
                "tipoMueble = " + this.getTipoMueble() + "\n";
    }
}
