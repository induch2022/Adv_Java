package src;

public class ArraysExample  {
    public static void main(String[] args) {
        Car cars[] = new Car[5];
         
        cars[0] = new Car("Toyota", 56600);
        cars[1] = new Car("Honda", 63500);
        cars[2] = new Car("Tata", 87400);
        cars[3] = new Car("Hyundai", 63000);
        cars[4] = new Car("Tesla", 70000);
         
        for(Car car: cars)
            car.printDetails();
    }
}
 
class Car {
    public String name;
    public int miles;
     
    public Car(String name, int miles) {
        this.name = name;
        this.miles = miles;
    }
     
    public void printDetails() {
        System.out.println(name+" - "+miles);
    }
}