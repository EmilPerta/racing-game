package org.fasttrackit.vehicles;


import java.time.LocalDate;

public class Vehicle {

    //   class variable (static variable)
    private static int totalVehicleCount;

    //    instance variable.
    private String name;
    private double fuelLevel;
    private double mileage;
    // protected ne confera acces la variabila din intregul pachet din care face parte si toate subclasele.
    protected double totalTraveledDistance;
    private double maxSpeed;

    private boolean damaged;
    private String color;

    private LocalDate manufacturingDate = LocalDate.now();

    public Vehicle() {
        totalVehicleCount++;
    }

    public double accelerate(double speed, double durationInHours) {

        if (fuelLevel <= 0 || damaged) {
            System.out.println("You cannot accelerate.");
            return 0;
        }
        //       local variable.
        if (speed > maxSpeed) {
            System.out.println("Max speed exceeded.");
            return 0;
        } else if (speed == maxSpeed) {
            System.out.println("Careful, max speed reached.");
        } else {
            System.out.println("Valid speed entered.");
        }

        System.out.println(name + " is accelerating with " + speed + " km/h for " + durationInHours + " h");

        double distance = speed * durationInHours;
        totalTraveledDistance += distance;

        System.out.println("Total traveled distance for vehicle " + name + ": " + totalTraveledDistance);

        double mileageMultiplier = 1;
        if (speed > 120) {
            mileageMultiplier = speed / 100;
        }
        double usedFuel = distance * mileage * mileageMultiplier / 100;
        fuelLevel -= usedFuel;
        System.out.println("Remaining fuel for vehicle " + name + ": " + fuelLevel);

        return distance;
    }

    public void setName(String name) {

        this.name = name.trim(); // trim sterge spatiile de la inceputul si sfarsitul String-ului
    }

    public String getName() {
        return name;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getTotalTraveledDistance() {
        return totalTraveledDistance;
    }

    public void setTotalTraveledDistance(double totalTraveledDistance) {
        this.totalTraveledDistance = totalTraveledDistance;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isDamaged() {
        return damaged;
    }

    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
        System.out.println(getManufacturingDate());
    }

    // read-only property(nu are setter) (daca ar fi avut doar setter
// ar fi fost write-only)
    public static int getTotalVehicleCount() {
        return totalVehicleCount;
    }
}
