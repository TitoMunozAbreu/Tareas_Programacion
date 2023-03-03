package Ikea;

public abstract class ProductoHogar extends Producto{
    TipoMaterial tipoMaterial;

    public ProductoHogar(){}

    public ProductoHogar(String nombre, String descripcion, double precio, TipoMaterial tipoMaterial) {
        super(nombre, descripcion, precio);
        this.tipoMaterial = tipoMaterial;
    }

    public TipoMaterial getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(TipoMaterial tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "tipoMaterial = " + this.getTipoMaterial() + "\n";
    }
}
