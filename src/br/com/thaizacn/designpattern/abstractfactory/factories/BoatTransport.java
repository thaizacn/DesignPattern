package src.br.com.thaizacn.designpattern.abstractfactory.factories;

import src.br.com.thaizacn.designpattern.abstractfactory.aircrafts.Airplane;
import src.br.com.thaizacn.designpattern.abstractfactory.aircrafts.IAircraft;
import src.br.com.thaizacn.designpattern.abstractfactory.boats.Boat;
import src.br.com.thaizacn.designpattern.abstractfactory.boats.IBoat;
import src.br.com.thaizacn.designpattern.abstractfactory.landvehicles.Car;
import src.br.com.thaizacn.designpattern.abstractfactory.landvehicles.ILandVehicle;

public class BoatTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }

    @Override
    public IBoat createTransportBoat() {
        return new Boat();
    }


}