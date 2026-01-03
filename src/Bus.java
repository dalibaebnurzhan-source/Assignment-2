public class Bus extends Vehicle implements Servicable {
    private int passengerCapacity;

    public Bus(String model, int year, double basePrice, int passengerCapacity) {
        super(model, year, basePrice);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public double calculateInsuranceFee() {
        return basePrice * 0.08 + passengerCapacity * 2;
    }

    @Override
    public void performService() {
        System.out.println("Bus ID " + id + " is getting heavy-duty bus service.");
    }

    @Override
    public int getServiceIntervalKm() {
        return 20000;
    }

    @Override
    public String toString() {
        return "Bus -> " + super.toString() +
                ", Capacity: " + passengerCapacity;
    }
}
