package src.br.com.thaizacn.designpattern.abstractfactory;

import src.br.com.thaizacn.designpattern.abstractfactory.app.Application;
import src.br.com.thaizacn.designpattern.abstractfactory.factories.BoatTransport;
import src.br.com.thaizacn.designpattern.abstractfactory.factories.ITransportFactory;
import src.br.com.thaizacn.designpattern.abstractfactory.factories.NineNineTransport;
import src.br.com.thaizacn.designpattern.abstractfactory.factories.UberTransport;

import java.util.Scanner;

public class Main {

    public static Application configureApplication() {
        Application app;
        ITransportFactory factory;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione a empresa de transporte ('uber', '99' ou 'boat'): ");
        String company = scanner.nextLine();

        if (company.equals("uber")) {
            factory = new UberTransport();
        } else if (company.equals("99")) {
            factory = new NineNineTransport();
        } else {
            factory = new BoatTransport();
        }
        app = new Application(factory);

        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.startRoute();
    }
}
