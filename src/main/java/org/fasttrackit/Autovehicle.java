package org.fasttrackit;

public class Autovehicle extends  Vehicle {

    //"has-a" relationship (aggregation)
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Autovehicle(Engine engine){
        this.engine = engine;

    }
}
