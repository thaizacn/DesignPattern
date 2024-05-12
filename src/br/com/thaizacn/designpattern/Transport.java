package src.br.com.thaizacn.designpattern;

import src.br.com.thaizacn.designpattern.vehicle.IVehicle;

public abstract class Transport {

    void startTransport(){
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}
