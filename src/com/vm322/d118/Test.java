package com.vm322.d118;

public class Test {
    public static void main(String[] args) {
        System.out.println("自定义普通的汽车");
        Car car = new Car();
        car.setName("Adui");
        car.setSpeed(60);
        System.out.println(car);
        System.out.println("加装GPS模块");
        GPSCar gpscar = new GPSCar();
        gpscar.setName("Audi");
        gpscar.setSpeed(70);
        System.out.println(gpscar);
    }
}
