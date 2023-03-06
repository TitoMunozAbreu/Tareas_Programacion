package Warriors;

public class Arquero extends Personaje{
    private int punteria;
    private String arco;

    public Arquero(){}

    public Arquero(String nombre, int puntosVida, int fuerza, int punteria, String arco) {
        super(nombre, puntosVida, fuerza);
        this.punteria = punteria;
        this.arco = arco;
    }

    @Override
    public void atacar() {
        if(getPuntosVida() > 0){
            if(this.getPunteria() > 5){
                System.out.println(this.getClass().getName() + " \n"
                        + super.getNombre() + " \n"
                        + "realiza un ataque con " +this.getArco() + "\n");
            }else {
                System.out.println("El ataque ha fallado \n");
            }
        }else {
            System.out.println(this.getClass().getName() + " \n"
                    + super.getNombre() + " \n"
                    + "no tiene vidas para atacar \n");
        }

    }

    @Override
    public void defender() {
        System.out.println(this.getClass().getName() + " \n"
                + super.getNombre() + " \n"
                + "se esconde debajo de una mata de mango \n");
        super.setPuntosVida(-1);
    }

    public int getPunteria() {
        return punteria;
    }

    public void setPunteria(int punteria) {
        this.punteria = punteria;
    }

    public String getArco() {
        return arco;
    }

    public void setArco(String arco) {
        this.arco = arco;
    }

    @Override
    public String toString() {
        return "Arquero " + "\n" +
                super.toString() +
                "punteria = " + this.getPunteria() + "\n" +
                "arco = " + this.getArco() + "\n";
    }
}
