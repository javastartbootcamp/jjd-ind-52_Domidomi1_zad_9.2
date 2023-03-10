package pl.javastart.task;

public class Car extends Vehicle {

    private boolean airConditionOnOff;
    private double consumptionIncreaser;

    public Car(String name, double tankCapacity, double aveFuelConsumption, boolean airConditionOnOff) {
        super(name, tankCapacity, aveFuelConsumption);
        this.airConditionOnOff = airConditionOnOff;

    }

    public boolean isAirConditionOnOff() {
        return airConditionOnOff;
    }

    public void setAirConditionOnOff(boolean airConditionOnOff) {
        this.airConditionOnOff = airConditionOnOff;
    }

    public double getConsumptionIncreaser() {
        return consumptionIncreaser;
    }

    public void setConsumptionIncreaser(double consumptionGrowth) {
        this.consumptionIncreaser = consumptionGrowth;
    }

    //Jeśli klimatyzacja jest włączona, to samochód spala o 0,8l na 100km
    // więcej,
    // a ciężarówka o 1,6l na 100km więcej.

    double consumptionGrowth() {
        return consumptionIncreaser + 0.8;
    }

    /* double sumOfConsumption(Vehicle[] vehicles) {
        double sum = 0;
        for (Vehicle vehicle : vehicles) {
            if (airConditionOnOff == true) {
                sum += consumptionGrowth();
            }
        }
        return getAveFuelConsumption();
    } */

    @Override
    String getInfo() {
        return super.getInfo() + ". Aircondition: " + airConditionOnOff;
    }
}
