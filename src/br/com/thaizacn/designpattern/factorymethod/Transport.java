package src.br.com.thaizacn.designpattern.factorymethod;

import src.br.com.thaizacn.designpattern.factorymethod.vehicle.IVehicle;

public abstract class Transport {

    void startTransport(){
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}
