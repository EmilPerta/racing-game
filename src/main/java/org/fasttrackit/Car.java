package org.fasttrackit;

//"is-a" relationship (inheritance)
public class Car extends Autovehicle {



    int doorCount;


    public Car(Engine engine) {
        super(engine);
    }
}
