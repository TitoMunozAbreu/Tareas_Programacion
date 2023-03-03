package Ikea;

public class Test {
    public static void main(String[] args) {
        Tienda ikea = new Tienda();
        Producto estanteria = new Mueble("kallax", "Estanteria de materiales reciclado", 25.85, TipoMaterial.PLASTICO, "Estanteria" );
        Producto flexo = new ArticuloDecoracion("Forsa", "Flexo materiales reciclado", 50.75, TipoMaterial.MADERA);

        ikea.agregarProducto(estanteria);
        ikea.agregarProducto(flexo);
        System.out.println(ikea.toString());





    }
}
