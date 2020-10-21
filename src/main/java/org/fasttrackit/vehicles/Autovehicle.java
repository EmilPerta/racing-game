package org.fasttrackit.vehicles;

import org.fasttrackit.Engine;

public class Autovehicle extends  Vehicle {

    //"has-a" relationship (aggregation)
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    // constructor overloading (fiecare autovehicol primeste un motor implicit care nu mai trebuie declarat)
    public Autovehicle(){
        engine = new Engine();
    }

    public Autovehicle(Engine engine){
        this.engine = engine;

    }
}
