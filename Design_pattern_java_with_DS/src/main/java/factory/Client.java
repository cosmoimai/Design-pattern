package factory;

public class Client {
    private Vehicle pvehicle;

    Client(){
        pvehicle = null;
    }

    void BuildVehicle(VehicleType vehicleType)
    {
        VehicleFactory vf = new VehicleFactory();
        pvehicle = vf.build(vehicleType);
    }

    Vehicle getVehicle(){
        return pvehicle;
    }
}
