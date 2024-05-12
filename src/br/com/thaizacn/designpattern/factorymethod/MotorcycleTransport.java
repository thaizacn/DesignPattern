package src.br.com.thaizacn.designpattern.factorymethod;

import src.br.com.thaizacn.designpattern.factorymethod.vehicle.IVehicle;
import src.br.com.thaizacn.designpattern.factorymethod.vehicle.Motorcycle;

public class MotorcycleTransport extends Transport{

    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}