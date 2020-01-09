package extentedclass;

import sun.security.krb5.SCDynamicStoreConfig;

public class Car {


    private String brand ;
    String model;
    private double year ;
    double price;
    private boolean isCarUsed;


    public Car(String brand, String model, int year, double price, boolean isCarUsed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isCarUsed = isCarUsed;


    }

    public void firstStart(){

        System.out.println("start");
    }
     public void pressStop(){
        System.out.println("car should stop anytime");
     }

     public String getBrand() {
        return this.brand;
     }




}