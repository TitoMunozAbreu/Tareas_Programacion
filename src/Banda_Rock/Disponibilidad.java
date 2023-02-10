package Banda_Rock;

public enum Disponibilidad {
    ENTRE_SEMANA("Solo disponible entre semana"),
    FINES_SEMANA("Solo disponible entre semana");

    private String description;

    private Disponibilidad(String d){this.description = d;}

    public String getDescription(){return this.description;}
}
