package AppGestionSocios;

import AppGestionSocios.exceptions.DatosIngresadosMal;
import AppGestionSocios.exceptions.SocioExiste;
import AppGestionSocios.exceptions.SocioNoExiste;
import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.time.format.DateTimeParseException;
import java.util.*;

public class GestionSocios {
    Set<Socio> socios;
    private String url;

    public GestionSocios(String url) {
        crearFicheros(url);
        this.url = url;
        this.socios = leerObjetoFichero();

    }

    public void crearFicheros(String url) {
        // inicializar objeto file
        File file = new File(url);

        try {
            //verificar si existe
            if (!file.exists()) {
                //crear fichero
                file.createNewFile();
                System.out.println(" ** Fichero creado exitosamente **");
            }

        } catch (FileAlreadyExistsException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void desplegarMenu() {

        Scanner sc = new Scanner(System.in);
        boolean trueFalse = true;

        do {
            System.out.println("\n\t ** MENU GESTION DE SOCIOS ** ");
            System.out.println("\t 1. Alta");
            System.out.println("\t 2. Baja");
            System.out.println("\t 3. Modificacion");
            System.out.println("\t 4. Listado por DNI");
            System.out.println("\t 5. Listado por antiguedad");
            System.out.println("\t 6. Salir");
            System.out.print("Elige una opcion: ");


                try {
                    int opcion = Integer.parseInt(sc.next());
                    switch (opcion) {
                        case 1:
                            alta();
                            break;
                        case 2:
                            baja();
                            break;
                        case 3:
                            modificar();
                            break;
                        case 4:
                            System.out.println(listadoOrdenadoDNI());
                            break;
                        case 5:
                            listadoOrdenadoAntiguedad();
                            break;
                        case 6:
                            trueFalse = false;
                            System.out.println(" ** Sesion Menu Finalizada ** ");
                            break;
                        default:
                            throw new DatosIngresadosMal();
                    }
                } catch (DatosIngresadosMal e) {
                    System.out.println(e.toString());
                } catch (SocioNoExiste e) {
                    System.out.println(e.toString());
                } catch (SocioExiste e) {
                    System.out.println(e.toString());
                } catch (DateTimeParseException e) {
                    System.out.println("Fecha mal ingresada, patron de fecha es: dd-MM-yyyy");;
                }catch (NumberFormatException e){
                    System.out.println("Ingresar al menu, enteros del 1-6");
                }

        } while (trueFalse);
    }


    public void alta() throws SocioExiste{
        Scanner sc = new Scanner(System.in);
        //solicitar datos
        System.out.println("1. Alta de socio");
        System.out.print("Ingresar DNI: ");
        String dni = sc.next();

            //comprobar que no exista
            if(!(buscarSocios(dni))){
                //solicitar resto de datos
                System.out.print("Ingresar nombre: ");
                String nombre = sc.next();
                System.out.print("Ingresar fecha: ");
                String fechaAlta = sc.next();
                // agregar socio al conjunto
                socios.add(new Socio(dni, nombre, fechaAlta));
                System.out.println(" ** socio creado existosamente **");
                //ingresar datos al fichero
                escribirObjetosFichero();
            }else {
                throw new SocioExiste();

            }

    }

    public boolean buscarSocios(String dni){
        boolean trueFalse= false;
        for (Socio socio: socios){
            if(socio.getDNI().equals(dni)){
                trueFalse = true;
            }
        }
        return trueFalse;
    }

    public void baja() {
        Scanner sc = new Scanner(System.in);
        //solicitar datos
        System.out.println("2. Baja de socio");
        System.out.print("Ingresar DNI:");
        String dni = sc.next();

        //Creamos un objeto para iterar con el conjunto
        Iterator<Socio> ite = socios.iterator();

        while (ite.hasNext()) {
            //almacenamos el objeto de paso en la iteracion
            Socio socio = ite.next();

            //comprobar que el objeto sea igual
            if (socio.getDNI().equals(dni)) {
                //eliminar objeto del conjunto
                ite.remove();
                System.out.println(" ** Socio: " + socio.getNombre() + " borrado exitosamente **");
                //actualizar datos al fichero
                escribirObjetosFichero();

            }
        }


    }

    private void modificar() throws SocioNoExiste {
        Scanner sc = new Scanner(System.in);
        //solicitar datos
        System.out.println("2. Modificar socio");
        System.out.print("Ingresar DNI del socio a modificar:");
        String dni = sc.next();

            //Creamos un objeto para iterar con el conjunto
            Iterator<Socio> ite = socios.iterator();

            while (ite.hasNext()) {
                //almacenamos el objeto de paso en la iteracion
                Socio socio = ite.next();
                    //comprobar que el objeto sea igual
                    if (socio.getDNI().equals(dni)) {
                        System.out.print("Ingresar NUEVO DNI:");
                        socio.setDNI(sc.next());
                        System.out.print("Ingresar NUEVO nombre:");
                        socio.setNombre(sc.next());
                        System.out.println(" ** Socio modificado exitosamente **");
                        //actualizar datos al fichero
                        escribirObjetosFichero();
                    } else {
                       throw new SocioNoExiste();
                    }
                }
    }

    public Set<Socio> listadoOrdenadoDNI() {
        return this.socios;
    }

    public void listadoOrdenadoAntiguedad() {
        //crear el objeto Comparator
        class sortedByAntiguedad implements Comparator<Socio>{

            @Override
            public int compare(Socio o1, Socio o2) {
                return Long.compare(o2.fechaAntiguedad(),o1.fechaAntiguedad());
            }
        }

        Set<Socio> sociosSortedByAntiguedad = new TreeSet<>(new sortedByAntiguedad());
        for (Socio socio:this.socios){
            sociosSortedByAntiguedad.add(socio);
        }
        System.out.println(sociosSortedByAntiguedad);


    }

    public void escribirObjetosFichero() {

        try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(this.url))) {
            //escribir objetos en el fichero
            ous.writeObject(socios);
            System.out.println("...datos actualizados al fichero");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Set<Socio> leerObjetoFichero() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(this.url))) {

            //actualizar conjunto de socios
            this.socios = (Set<Socio>) ois.readObject();
            System.out.println("...leyendo datos del fichero");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return this.socios;
    }


}
