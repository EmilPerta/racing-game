package org.fasttrackit;

import org.fasttrackit.vehicles.Autovehicle;

public class Mechanic {
    public  void repair(Autovehicle autovehicle) {

        autovehicle.setEngine(new Engine());

        autovehicle.setDamaged(false);

        autovehicle.setTotalTraveledDistance(autovehicle.getTotalTraveledDistance() - 100);

    }
}
