package Banda_Rock;

public enum Instrumento {
    GUITARRA ("Guitarrista"),
    BAJO ("Bajista"),
    BATERIA ("Bateria"),
    PIANO ("Pianista"),
    MICROFONO ("Vocalista"),
    ARMONICA ("Armonica");

    private String description;

    private Instrumento(String d){this.description = d;}

    public String getDescription(){return this.description;}
}
