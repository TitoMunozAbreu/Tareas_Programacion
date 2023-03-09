package Telecomunicaciones;

public enum ZonaInterlocutor {
    DEU ("ALEMANIA"),
    USA ("ESTADOS UNIDOS"),
    MA ("MARRUECOS"),
    CHN ("CHINA"),
    VEN ("VENEZUELA");

    private final String description;

    private ZonaInterlocutor(String d){this.description = d;};

    public String getDescription() {
        return description;
    }
}
