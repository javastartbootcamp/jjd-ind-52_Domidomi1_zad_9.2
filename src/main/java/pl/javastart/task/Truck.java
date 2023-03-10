package pl.javastart.task;

public class Truck extends Car {

    private double loadWeight;

    public Truck(String name, double tankCapacity, double aveFuelConsumption, boolean airConditionOnOff, double loadWeight) {
        super(name, tankCapacity, aveFuelConsumption, airConditionOnOff);
        this.loadWeight = loadWeight;
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

    @Override
    String getInfo() {
        return super.getInfo() + ". Weight of load: " + loadWeight;
    }
}
