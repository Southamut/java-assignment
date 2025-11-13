public class Main {
    public static void main(String[] args) {
        //first object
        Car car = new Car();
        car.setBrand("Toyota");
        car.start();

        //second object
        Car car2 = new Car();
        car2.setBrand("Honda");
        car2.drive();
    }
}

class Vehicle {
    private String brand;

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }
    public String getBrand() {
        return this.brand;
    }
    public void start() {
        System.out.println(this.getBrand() + " Starting engine...");
}
}

class Car extends Vehicle {
    public void drive() {
        System.out.println(this.getBrand() + " Driving on the road...");
    }
}