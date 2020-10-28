package org.fasttrackit;

import org.fasttrackit.utils.ScannerUtils;
import org.fasttrackit.vehicles.Vehicle;

public class Game {

    private Track[] tracks = new Track[3];

    private Vehicle competitor1;
    private Vehicle competitor2;
    // declarand scanerul si metodele static nu mai este nevoie sa fie instantiat.
 //   ScannerUtils scannerUtils = new ScannerUtils();

    public void start() {
        System.out.println("Welcome to the Racing game!");

        initializeTrack();

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

    private void initializeTrack(){
        Track track1 = new Track();
        track1.setName("Highway");
        track1.setLength(200);

        tracks[0] = track1;

        Track track2 = new Track();
        track2.setName("Street Circuit");
        track2.setLength(100);

        tracks[1] = track2;

        displayTracks();
    }
    private void displayTracks(){
        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] != null) {
                System.out.println((i + 1) + ". " + tracks[i].getName() + ": " + tracks[i].getLength());
            }
        }
    }

}
