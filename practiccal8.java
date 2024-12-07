class Car {
    String brand;
    String model;
    int year;
    double price;

    
    Car() {
        brand = "Unknown";
        model = "Unknown";
        year = 0;
        price = 0.0;
    }

    
    Car(String b) {
        brand = b;
        model = "Unknown";
        year = 0;
        price = 0.0;
    }

    
    Car(String b, String m) {
        brand = b;
        model = m;
        year = 0;
        price = 0.0;
    }

   
    Car(String b, String m, int y, double p) {
        brand = b;
        model = m;
        year = y;
        price = p;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year + ", Price: " + price);
    }
}

public class practiccal8 {
    public static void main(String[] args) {

        Car car1 = new Car();                                 
        Car car2 = new Car("Toyota");                         
        Car car3 = new Car("Toyota", "Camry");                
        Car car4 = new Car("Toyota", "Camry", 2024, 30000.0); 

        car1.display();
        car2.display();
        car3.display();
        car4.display();
    }
}



