package Empresa;

public enum TipoCliente {
    PREMIUN("Cliente Premiun"),
    ESTANDAR("Cliente Standar");

    private String description;

    private TipoCliente(String d){this.description = d;}

    public String getDescription(){return this.description;}


}
