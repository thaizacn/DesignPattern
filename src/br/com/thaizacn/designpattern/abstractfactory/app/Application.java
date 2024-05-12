package src.br.com.thaizacn.designpattern.abstractfactory.app;

import src.br.com.thaizacn.designpattern.abstractfactory.aircrafts.IAircraft;
import src.br.com.thaizacn.designpattern.abstractfactory.boats.IBoat;
import src.br.com.thaizacn.designpattern.abstractfactory.factories.ITransportFactory;
import src.br.com.thaizacn.designpattern.abstractfactory.landvehicles.ILandVehicle;

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;
    private IBoat boat;

    public Application(ITransportFactory factory){
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
        boat = factory.createTransportBoat();
    }

    public void startRoute(){
        vehicle.startRoute();
        aircraft.startRoute();
        boat.startRoute();
    }
}
