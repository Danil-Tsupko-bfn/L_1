package org.example;
class Car {
    private String brand;
    private int year;
    private double horsepower;

    public Car(String brand, int year, double horsepower) {
        this.brand = brand;
        this.year = year;
        this.horsepower = horsepower;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public double getHorsepower() {
        return horsepower;
    }

    public void startEngine() {
        System.out.println("Engine started for " + brand + " car.");
    }

    public void accelerate() {
        System.out.println("Car is accelerating.");
    }
}

class Formula1Car extends Car {
    private double downforce;

    public Formula1Car(String brand, int year, double horsepower, double downforce) {
        super(brand, year, horsepower);
        this.downforce = downforce;
    }

    public double getDownforce() {
        return downforce;
    }

    @Override
    public void accelerate() {
        System.out.println("Formula 1 car is accelerating with high downforce.");
    }

    public void useDRS() {
        System.out.println("Formula 1 car is using DRS (Drag Reduction System).");
    }
}

class StreetCar extends Car {
    private boolean hasAirConditioning;

    public StreetCar(String brand, int year, double horsepower, boolean hasAirConditioning) {
        super(brand, year, horsepower);
        this.hasAirConditioning = hasAirConditioning;
    }

    public boolean hasAirConditioning() {
        return hasAirConditioning;
    }

    @Override
    public void accelerate() {
        System.out.println("Street car is accelerating on regular roads.");
    }

    public void honkHorn() {
        System.out.println("Street car is honking the horn.");
    }
}

public class AutoRacingHierarchy {
    public static void main(String[] args) {
        Formula1Car formula1Car = new Formula1Car("Mercedes", 2022, 1000, 500);
        StreetCar streetCar = new StreetCar("Toyota", 2022, 200, true);

        formula1Car.startEngine();
        formula1Car.accelerate();
        formula1Car.useDRS();

        streetCar.startEngine();
        streetCar.accelerate();
        streetCar.honkHorn();
    }
}
