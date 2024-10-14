class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String make, String model, int year, boolean hasSidecar) {
        super(make, model, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Есть коляска: " + (hasSidecar ? "Да" : "Нет");
    }
}