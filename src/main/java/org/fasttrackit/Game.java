package org.fasttrackit;

import org.fasttrackit.utils.ScannerUtils;

public class Game {
    // declarand scanerul si metodele static nu mai este nevoie sa fie instantiat.
 //   ScannerUtils scannerUtils = new ScannerUtils();

    public void start() {
        System.out.println("Welcome to the Racing game!");
        int playerCount = getPlayerCountFromUser();
        System.out.println("Numbers of players: " + playerCount);

        String vehicleName = getVehicleNameFromUser();
        System.out.println("Vehicle name: " + vehicleName);
    }

    private int getPlayerCountFromUser() {
        System.out.println("Please enter number of players: ");
        return ScannerUtils.nextIntAndMoveToNextLine();
    }

    private String getVehicleNameFromUser() {
        System.out.println("Please enter vehicle name: ");
        return ScannerUtils.nextLine();
    }

}
