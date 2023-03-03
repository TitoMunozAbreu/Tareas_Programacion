package Ikea;

import java.util.Arrays;

public class Tienda {
    Producto[] productos;


    public Tienda() {
        this.productos = new Producto[0];
    }

    public Producto[] agregarProducto(Producto p){
        //Creamos un nuevo array tipo producto
        Producto[] newProductos = new Producto[productos.length + 1];
        //Copiamos los elementos del anterior array al nuevo
        System.arraycopy(productos,0,newProductos,0,productos.length);
        //Guardar el nuevo producto en el array
        newProductos[newProductos.length-1] = p;
        //Actualizar el array de la clase
        this.setProductos(newProductos);


        return this.getProductos();

    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Tienda:" + "\n" +
                Arrays.toString(productos);
    }
}
