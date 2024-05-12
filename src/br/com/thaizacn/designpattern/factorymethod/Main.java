package src.br.com.thaizacn.designpattern.factorymethod;

import java.util.Scanner;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione o tipo de transporte ('uber', 'log' ou 'eats'): ");
        String tipoTransporte = scanner.nextLine();

        Transport transport = configure(tipoTransporte);
        if (transport != null) {
            runTransport(transport);
        }

        scanner.close();
    }

    private static void runTransport(Transport transport) {
        transport.startTransport();
    }

    private static Transport configure(String type) {
        switch (type) {
            case "uber":
                return new CarTransport();
            case "log":
                return new MotorcycleTransport();
            case "eats":
                return new BikeTransport();
            default:
                System.out.println("Tipo de transporte inválido. Selecione 'uber', 'log' ou 'eats'.");
                return null;
        }
    }
}
