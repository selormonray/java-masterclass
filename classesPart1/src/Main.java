public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.setMake("Porsche");
        car.setModel("Cayenne");
        car.setDoors(2);
        car.setColour("green");
        car.setConvertible(true);

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());

        car.describeCar();
    }
}