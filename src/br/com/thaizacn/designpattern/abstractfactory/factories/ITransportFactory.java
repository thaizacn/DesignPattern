package src.br.com.thaizacn.designpattern.abstractfactory.factories;

import src.br.com.thaizacn.designpattern.abstractfactory.aircrafts.IAircraft;
import src.br.com.thaizacn.designpattern.abstractfactory.boats.IBoat;
import src.br.com.thaizacn.designpattern.abstractfactory.landvehicles.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
    IBoat createTransportBoat();
}