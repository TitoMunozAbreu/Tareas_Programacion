package Empresa_Mensajeria;

public enum TipoVehiculo {
    BICICLETA("Reparto en bicicleta"),
    MOTO("Reparto en moto"),
    CAMION("Reparto en camion");

    private String description;

    private TipoVehiculo(String d){this.description = d;}

    public String getDescription(){return this.description;}
}
