package Ch8ClassesObjects;

public class Car {
    //filds
    String name;
    double price;
    int wheels;
    static int totalCars;
    //constructer
    public Car(String carName,double carPrice,int nwheels){
        this.name=carName;
        this.price=carPrice;
        this.wheels=nwheels;
        //
        totalCars++;
    }
 public void displayDetails(){
     System.out.println("car name: "+name);
     System.out.println("car price: "+price);
     System.out.println("wheels: "+wheels);

 }
 public static void displayTotalCars(){
     System.out.println("Total cars: "+totalCars);
 }

    public static void main(String[] args) {
        Car car1 = new Car("toyota",50000,6);
        car1.displayDetails();
        System.out.println("-----------------");
        Car car2 = new Car("saarif",40000,7);
        Car car3 = new Car("nooha",90000,5);
        car2.displayDetails();
        System.out.println("---------------------------------");
        car3.displayDetails();
    }
}


