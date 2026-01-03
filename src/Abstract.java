public abstract class Vehicle {

    protected int id;
    protected static int idGen = 1;
    protected String model;
    protected int year;
    protected double basePrice;

    // Constructor
    protected Vehicle(String model, int year, double basePrice) {
        this.id = idGen++;
        setModel(model);
        setYear(year);
        setBasePrice(basePrice);
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getBasePrice() {
        return basePrice;
    }

    // Setters with validation
    public void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Model must not be null or empty");
        }
        this.model = model;
    }

    public void setYear(int year) {
        if (year < 1950 || year > 2100) {
            throw new IllegalArgumentException("Year out of reasonable range");
        }
        this.year = year;
    }

    public void setBasePrice(double basePrice) {
        if (basePrice <= 0) {
            throw new IllegalArgumentException("Base price must be > 0");
        }
        this.basePrice = basePrice;
    }

    // Business logic
    public int getAge(int currentYear) {
        return currentYear - year;
    }

    public abstract double calculateInsuranceFee();

    @Override
    public String toString() {
        return "ID: " + id +
                ", Model: " + model +
                ", Year: " + year +
                ", Base price: " + basePrice;
    }
}
