package src.br.com.thaizacn.designpattern;

import src.br.com.thaizacn.designpattern.vehicle.Car;
import src.br.com.thaizacn.designpattern.vehicle.IVehicle;

public class CarTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}