package Warriors;

public class Guerrero extends Personaje{
    private int armadura;
    private String arma;

    public Guerrero(){}

    public Guerrero(String nombre, int puntosVida, int fuerza, int armadura, String arma) {
        super(nombre, puntosVida, fuerza);
        this.armadura = armadura;
        this.arma = arma;
    }

    @Override
    public void atacar() {
        if(super.getPuntosVida() > 0){
            System.out.println(this.getClass().getName() + " \n"
                    + super.getNombre() + " \n"
                    + "realiza un ataque con " +this.getArma() + "\n");
        }else {
            System.out.println(this.getClass().getName() + " \n"
                    + super.getNombre() + " \n"
                    + "no tiene vidas para atacar \n");
        }

    }

    @Override
    public void defender() {
        if(this.getArmadura() > 0){
            System.out.println(this.getClass().getName() + " \n"
                    + super.getNombre() + " \n"
                    + "se defiende con su armadura" +this.getArmadura() + "\n");
            this.setArmadura(-1);
            super.setPuntosVida(-1);

        }else {
            System.out.println(this.getClass().getName() + " \n"
                    + super.getNombre() + " \n"
                    + "no posee armadura para defenderse \n");
        }
    }


    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura -= armadura;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Guerrero" + "\n" +
                super.toString() +
                "armadura = " + this.getArmadura() + "\n" +
                "arma = " + this.getArma() + "\n";
    }
}
