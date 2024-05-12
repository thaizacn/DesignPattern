package src.br.com.thaizacn.designpattern.abstractfactory.landvehicles;

public class Motorcycle implements ILandVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando a entrega");
    }

    @Override
    public void getCargo() {
        System.out.println("Já pegamos a encomenda!");
    }
}