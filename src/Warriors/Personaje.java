package Warriors;

public  abstract class Personaje {
    private String nombre;
    private int puntosVida;
    private int fuerza;

    public Personaje(){}

    public Personaje(String nombre, int puntosVida, int fuerza) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.fuerza = fuerza;
    }

    public abstract void atacar();

    public abstract void defender();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida -= puntosVida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public String toString() {
        return "nombre = " + this.getNombre() + "\n" +
                "puntosVida = " + this.getPuntosVida() + "\n" +
                "fuerza = " + this.getFuerza() + "\n";
    }
}
