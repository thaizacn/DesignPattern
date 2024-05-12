package src.br.com.thaizacn.designpattern;

import src.br.com.thaizacn.designpattern.vehicle.Bike;
import src.br.com.thaizacn.designpattern.vehicle.IVehicle;

public class BikeTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}