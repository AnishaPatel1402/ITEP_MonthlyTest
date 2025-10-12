// 1. Constructor Problem
// Car Inventory System
// Create a class Car with fields: brand, model, price.
// Implement:
// A default constructor (sets "Unknown" values and price = 0).
// A parameterized constructor to initialize all fields.
// A copy constructor to clone another Car.
// Write a test class to create cars using all three constructors and print their details.

class Car{
    private String brand;
    private String model;
    private double price;

    public Car(){
        this.brand = "Unknown";
        this.model = "Umknown";
        this.price = 0.0;
    }

    public Car(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Car(Car c){
        this.brand = c.brand;
        this.model = c.model;
        this.price = c.price;
    }

    public void showCarDetails(){
        System.out.println("Car Brand : "+ this.brand);
        System.out.println("Car Model : "+ this.model);
        System.out.println("Car Price : "+ this.price);
        System.out.println();
    }

}

class Test{
    public static void main(String args[]){
        Car car1 = new Car();
        Car car2 = new Car("Toyota", "AP2005", 2000000);
        Car dummyCar = new Car("MarutiSuzuki", "SP2001", 500000);
        Car car3 = new Car(dummyCar);

        car1.showCarDetails();
        car2.showCarDetails();

        dummyCar.showCarDetails();
        car3.showCarDetails();
    }
}