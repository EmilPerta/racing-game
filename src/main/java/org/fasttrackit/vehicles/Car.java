package org.fasttrackit.vehicles;

import org.fasttrackit.Engine;

//"is-a" relationship (inheritance)
public class Car extends Autovehicle {



   private int doorCount;

    public Car() {
    }

    public Car(Engine engine) {
        super(engine);
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doorCount=" + doorCount +
                "} " + super.toString();
    }
}
