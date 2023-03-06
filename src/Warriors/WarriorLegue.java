package Warriors;

public class WarriorLegue {
    public static void main(String[] args) {
        //Instaciar los objetos
        Personaje g1 = new Guerrero("Fidel", 5, 10,5,"Pistola");
        Personaje m1 = new Mago("ErCHE", 2, 50, 5,"sauco");
        Personaje m2 = new Mago("Bolivar", 1, 20, 2,"machete");
        Personaje a1 = new Arquero("Mujica", 3, 50, 3, "honda");

        //mostrar los datos del guerrero 1
        System.out.println(g1.toString());

        //g1 atacar
        g1.atacar();

        //g1 defiende
        g1.defender();

        //m1 atacar
        m1.atacar();

        //m1 defiende
        m1.defender();

        //a1 atacar
        a1.atacar();

        //a1 defiende
        a1.defender();

        if(m1.equals(m2)){
            System.out.println("Es el mismo mago");
        }else {
            System.out.println("No es el mismo mago");
        }








    }
}
