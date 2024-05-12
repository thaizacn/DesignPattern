package src.br.com.thaizacn.designpattern.abstractfactory.factories;

import src.br.com.thaizacn.designpattern.abstractfactory.aircrafts.Helicopter;
import src.br.com.thaizacn.designpattern.abstractfactory.aircrafts.IAircraft;
import src.br.com.thaizacn.designpattern.abstractfactory.boats.Boat;
import src.br.com.thaizacn.designpattern.abstractfactory.boats.IBoat;
import src.br.com.thaizacn.designpattern.abstractfactory.landvehicles.ILandVehicle;
import src.br.com.thaizacn.designpattern.abstractfactory.landvehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory {
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }

    @Override
    public IBoat createTransportBoat() {
        return new Boat();
    }
}