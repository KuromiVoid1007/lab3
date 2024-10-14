public class Main {
    public static void main(String[] args) {
        Car car = new Car("Porsche", "Panamera", 2022, 2);
        System.out.println(car.getDescription());

        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Ninja ", 2012, false);
        System.out.println(motorcycle.getDescription());
    }
}