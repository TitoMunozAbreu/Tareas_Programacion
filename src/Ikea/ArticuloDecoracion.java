package Ikea;

public class ArticuloDecoracion extends ProductoHogar{

    public ArticuloDecoracion(){}

    public ArticuloDecoracion(String nombre, String descripcion, double precio, TipoMaterial tipoMaterial) {
        super(nombre, descripcion, precio, tipoMaterial);
    }

    @Override
    public String toString() {
        return "\n" + "Articulo Decoracion:" + "\n" +
                super.toString() + "\n";
    }
}
