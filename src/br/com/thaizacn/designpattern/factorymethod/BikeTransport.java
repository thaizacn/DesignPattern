package src.br.com.thaizacn.designpattern.factorymethod;

import src.br.com.thaizacn.designpattern.factorymethod.vehicle.Bike;
import src.br.com.thaizacn.designpattern.factorymethod.vehicle.IVehicle;

public class BikeTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}