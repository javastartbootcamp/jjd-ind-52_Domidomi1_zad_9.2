package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        //W osobnej klasie utwórz tablicę zawierającą kilka pojazdów (z wyłączoną klimatyzacją),
        // wyświetl o nich podstawowe informacje oraz informację
        // o zasięgu danego pojazdu. Następnie włącz klimatyzację we wszystkich pojazdach
        // i wyświetl te same informacje jeszcze raz.

        Vehicle[] vehicles1 = new Vehicle[4];
        vehicles1[0] = new Car("Ford", 50.0, 8.0, false);
        vehicles1[1] = new Car("Mercedes", 60.0, 9.5, false);
        vehicles1[2] = new Car("Opel", 40.0, 7.0, false);
        vehicles1[3] = new Truck("Audi", 65.0, 10.0, false, 50.0);

        Vehicle[] vehicles2 = new Vehicle[4];
        vehicles2[0] = new Car("Ford", 50.0, 8.0, true);
        vehicles2[1] = new Car("Mercedes", 60.0, 9.5, true);
        vehicles2[2] = new Car("Opel", 40.0, 7.0, true);
        vehicles2[3] = new Truck("Audi", 65.0, 10.0, true, 50.0);
        printVehicles(vehicles1);
        printVehicles(vehicles2);
    }

    private static void printVehicles(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getInfo());
        }
    }
}
