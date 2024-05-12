package src.br.com.thaizacn.designpattern;

import src.br.com.thaizacn.designpattern.vehicle.IVehicle;
import src.br.com.thaizacn.designpattern.vehicle.Motorcycle;

public class MotorcycleTransport extends Transport{

    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}