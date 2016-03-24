package a.j.designpattern.factorymethod;

/**
 * Created by anjun on 3/24/16.
 */


 class Car implements Vehicle {
    Car(){
    System.out.println("this car()");
    }
}

 class Bike implements Vehicle {
     Bike(){
         System.out.println("this bike()");
     }
}

public class VehcileFactory {
    public static Vehicle createVehicle(String type) {
        if ("bike".equals(type)) return new Bike();
        if ("car".equals(type)) return new Car();
        throw new IllegalArgumentException();
    }
    public  static void main(String[]args){
        VehcileFactory.createVehicle("car");
    }

}
