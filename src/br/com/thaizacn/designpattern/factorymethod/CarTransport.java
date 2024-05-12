package src.br.com.thaizacn.designpattern.factorymethod;

import src.br.com.thaizacn.designpattern.factorymethod.vehicle.Car;
import src.br.com.thaizacn.designpattern.factorymethod.vehicle.IVehicle;

public class CarTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}