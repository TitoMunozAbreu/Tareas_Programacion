package GestionVehiculos.DataBase;

import GestionVehiculos.Vehicles.Vehicle;

import java.sql.*;

public class JDBC {//?serverTimezone=UTC
    private final String databaseURL = "jdbc:mysql://localhost:3306/vehicle";
    private final String username = "papaya";
    private final String password = "Mango_con.Sa1";




    public JDBC(){}

    public void connect()  {
        try (//Estableciendo conexion
            Connection connection = DriverManager.getConnection(databaseURL,username,password)){

            System.out.println("Conexion establecida...");
            //Estableciendo auto-commit false
            connection.setAutoCommit(false);
            System.out.println("Auto commit value is: " + connection.getAutoCommit());

        } catch (SQLException ex) {
            while (ex != null) {
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("Error Code:" + ex.getErrorCode());
                System.out.println("Message: " + ex.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause:" + t);
                    t = t.getCause();
                }
                ex = ex.getNextException();
            }
        }
    }

    //Aplicando el metodo C.R.U.D

    public void create(Vehicle vehicle){
        try(    //Establecer conexion
                Connection connection = DriverManager.getConnection(databaseURL,username,password);
                ){
            //Sentencia para escribir a la BD
            Statement statement = connection.createStatement();
            //Sentencia SQL
            String queryInsertar = "INSERT INTO CAR VALUES ('"
                                                        + vehicle.getLicensePlate() + "', '"
                                                        + vehicle.getMake() + "', '"
                                                        + vehicle.getModel() + "', "
                                                        + vehicle.getYear() + ")";
            //Comprueba que la sentencia se ejecuta
            if(statement.executeUpdate(queryInsertar) > 0){
                System.out.println("Vehiculo con la placa nº: " + vehicle.getLicensePlate() + " añadido a la BD");
            }

            String queryConsulta = "SELECT * FROM car";
            //Devuelve los datos consultados de la BD
            ResultSet resultSet = statement.executeQuery(queryConsulta);

        } catch (SQLException ex) {
            while (ex != null) {
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("Error Code:" + ex.getErrorCode());
                System.out.println("Message: " + ex.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause:" + t);
                    t = t.getCause();
                }
                ex = ex.getNextException();
            }
        }
    }

}
