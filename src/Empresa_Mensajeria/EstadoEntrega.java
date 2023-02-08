package Empresa_Mensajeria;

public enum EstadoEntrega {
    ENTREGADO("Paquete entregado"),
    NO_ENTREGADO("Paquete NO entregado");

    private String description;

    private EstadoEntrega(String d){this.description = d;}

    public String getDescription(){return this.description;}
}
