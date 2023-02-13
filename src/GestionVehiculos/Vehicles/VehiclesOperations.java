package GestionVehiculos.Vehicles;

public interface VehiclesOperations {

    public abstract boolean starEngine();
    public abstract void accelerate(int velocity);
    public abstract boolean stopEngine();
    public abstract void park();

}
