package Aeropuerto.Personas;

public enum Rango_Piloto {
    ALPHA ("Rango Alpha"),
    TANGO("Rango Tango"),
    AGUILA("Rango Aguila");

    private String description;

    private Rango_Piloto(String d){this.description = d;}

    public String getDescription(){return this.description;}

}
