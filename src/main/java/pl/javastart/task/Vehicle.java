package pl.javastart.task;

public class Vehicle {

    private String name;
    private double tankCapacity;
    private double aveFuelConsumption;

    public Vehicle(String name, double tankCapacity, double aveFuelConsumption) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.aveFuelConsumption = aveFuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getAveFuelConsumption() {
        return aveFuelConsumption;
    }

    public void setAveFuelConsumption(double aveFuelConsumption) {
        this.aveFuelConsumption = aveFuelConsumption;
    }

    String getInfo() {
        return name + ", tank capacity:  " + tankCapacity + ", fuel consumption: " + aveFuelConsumption;
    }
}
