package Aeropuerto.Personas;

public enum Idioma {
    ESPAÑOL("Habla Español"),
    INGLES("Speaks english"),
    FRANCES("parle français"),
    PORTUGES("fala português"),
    ALEMAN("Deutsch sprechen");

    private String description;

    private Idioma(String d){this.description = d;}

    public String getIdiomas(){return this.description;}

}
