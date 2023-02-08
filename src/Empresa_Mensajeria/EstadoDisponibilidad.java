package Empresa_Mensajeria;

public enum EstadoDisponibilidad {
    DISPONIBLE("Repartidor disponible"),
    NO_DISPONIBLE("Repartidor NO disponible");
    private String description;

    private EstadoDisponibilidad(String d){this.description = d;}

    public String getDescription(){return this.description;}
}
