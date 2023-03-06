package Warriors;

public class Mago extends Personaje{
    private int magia;
    private String varita;

    public Mago(){}

    public Mago(String nombre, int puntosVida, int fuerza, int magia, String varita) {
        super(nombre, puntosVida, fuerza);
        this.magia = magia;
        this.varita = varita;
    }

    @Override
    public void atacar() {
        if(getPuntosVida() > 0 && getMagia() > 0){
            if(this.getMagia() > 0){
                System.out.println(this.getClass().getName() + " \n"
                        + super.getNombre() + " \n"
                        + "ataca con " + this.getVarita() + "\n"
                        + "y realiza un hechizo:" + this.getMagia() + "\n");
                this.setMagia(-1);

            }else {
                System.out.println(this.getClass().getName() + " \n"
                        + super.getNombre() + " \n"
                        + "no posee mas hechizo para atacar \n");
            }
        }else {
            System.out.println(this.getClass().getName() + " \n"
                    + super.getNombre() + " \n"
                    + "no tiene vidas para atacar \n");
        }

    }

    @Override
    public void defender() {
        System.out.println("Utiliza un hechizo para defenderse \n");
        super.setPuntosVida(-1);
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia -= magia;
    }

    public String getVarita() {
        return varita;
    }

    public void setVarita(String varita) {
        this.varita = varita;
    }

    @Override
    public String toString() {
        return "Mago " + "\n" +
                super.toString() +
                "magia=" + this.getMagia() +
                "varita = " + this.getVarita() + "\n";
    }
}
