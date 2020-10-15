package org.fasttrackit;

public class Mechanic {
    public  void repair(Autovehicle autovehicle) {

        autovehicle.setEngine(new Engine());

        autovehicle.setDamaged(false);

        autovehicle.setTotalTraveledDistance(autovehicle.getTotalTraveledDistance() - 100);

    }
}
