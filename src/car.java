public class Car extends Vehicle implements Servicable {

    private int numberOfDoors;

    public Car(String model, int year, double basePrice, int numberOfDoors) {
        super(model, year, basePrice);

        if (numberOfDoors <= 0) {
            throw new IllegalArgumentException("Number of doors must be positive");
        }
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public double calculateInsuranceFee() {
        // Example formula based on basePrice and age
        int age = getAge(2025);
        return basePrice * 0.05 + age * 20;
    }

    @Override
    public void performService() {
        System.out.println("Car ID " + id + ": standard car service performed.");
    }

    @Override
    public int getServiceIntervalKm() {
        return 10000;
    }

    @Override
    public String toString() {
        return "Car -> " + super.toString() +
                ", Doors: " + numberOfDoors;
    }
}
