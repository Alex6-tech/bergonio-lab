import java.util.Scanner;


class Vehicle {
    private String brand;
    private int speed;
    private String fuelType;

    public Vehicle(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}


