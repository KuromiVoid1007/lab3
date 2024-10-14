class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Количество дверей: " + numberOfDoors;
    }
}