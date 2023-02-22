package GestionVehiculos.Vehicles;

import GestionVehiculos.Exceptions.NotFoundException;

public interface VehiclesOperations {

    public abstract boolean starEngine() throws NotFoundException;
    public abstract void accelerate(int velocity) throws NotFoundException;
    public abstract boolean stopEngine() throws NotFoundException;
    public abstract void park();

}
