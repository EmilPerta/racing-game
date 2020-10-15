package org.fasttrackit;


public class App {
    public static void main(String[] args) {
        Game game = new Game();
        game.start();


//        Engine engine1 = new Engine();
//        engine1.setManufacturer("Ferrari");
//        engine1.setCapacity(3000);
//
//        Car carReference = new Car(engine1);
//        carReference.setName("Ferrari");
//
//        carReference.setMaxSpeed(300);
//        carReference.setFuelLevel(60);
//        carReference.setMileage(12.5);
//        carReference.setTotalTraveledDistance(0);
//        carReference.setDamaged(false);
//        carReference.setDoorCount(1);
//        carReference.setColor("Red");
//
//        System.out.println("Engine1 capacity " + engine1.getCapacity());
//        System.out.println("Car engine capacity " + carReference.getEngine().getCapacity());
//
//        engine1.setCapacity(4000);
//        System.out.println("Engine1 capacity after modification " + engine1.getCapacity());
//
//        System.out.println("Properties of car " + carReference.getName());
//        System.out.println("Max speed: " + carReference.getMaxSpeed());
//        System.out.println("Fuel level: " + carReference.getFuelLevel());
//        System.out.println("Mileage: " + carReference.getMileage());
//        System.out.println("Total traveled distance: " + carReference.getTotalTraveledDistance());
//        System.out.println("Damaged: " + carReference.isDamaged());
//        System.out.println("Door count: " + carReference.getDoorCount());
//        System.out.println("Color " + carReference.getColor());
//        System.out.println();
//
//        Car car2 = new Car(new Engine());
//        car2.setName("Renault");
//        car2.setFuelLevel(70);
//        car2.setTotalTraveledDistance(100);
//        car2.setMaxSpeed(300);
//        car2.setMileage(10);
//
//        car2.getEngine().setCapacity(2000);
//
//        System.out.println("Properties of car " + car2.getName());
//        System.out.println("Max speed: " + car2.getMaxSpeed());
//        System.out.println("Fuel level: " + car2.getFuelLevel());
//        System.out.println("Mileage: " + car2.getMileage());
//        System.out.println("Total traveled distance: " + car2.getTotalTraveledDistance());
//        System.out.println("Damaged: " + car2.isDamaged());
//        System.out.println("Door count: " + car2.getDoorCount());
//        System.out.println("Color " + car2.getColor());
//
//        System.out.println("*********************************");
//        double distanceForCar1 = carReference.accelerate(60, 1);
//
//        double distanceForCar2 = car2.accelerate(130, 1);
//
//        System.out.println("Engine manufacturer before repair = " + carReference.getEngine().getManufacturer());
//        Mechanic mechanic = new Mechanic();
//        mechanic.repair(carReference);
//        System.out.println("Engine manufacturer after repair = " + carReference.getEngine().getManufacturer());
//
   }
}
