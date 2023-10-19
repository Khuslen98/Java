public class Good {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Maserati");
        car.setModel("koko");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        System.out.println("make = " + car.getDoors());
        System.out.println("model = " + car.getColor());
        car.describeCar();
    }
}
