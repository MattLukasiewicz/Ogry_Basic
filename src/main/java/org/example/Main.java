package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Main class where the magic happens.
 */
public class Main {
    /**
     * The main method where the simulation is executed.
     *
     * @param args command-line arguments
     * @throws IOException if an I/O error occurs while writing to the CSV file
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        PrintWriter csvWriter = new PrintWriter(new FileWriter("simulation_results.csv"));
        csvWriter.println("Hero;Apple Trees;Banana Trees;Wild Strawberry Trees;Max Points;Hero Points");

        int howManySimulations = 10;
        int mapDisplaySimulation = 1; // 1 display 0 no
        int simulationMapSize = 5;

        Harvester[] heroes = {
                new Shrek("Shrek", '%', 280, 1.0),
                new Batman("Batman", '#', 190, 1),
                new Santa_Claus("Santa Claus", '@', 160, 1)
        };

        Map map;
        for (int i = 0; i < howManySimulations; i++) {
            map = new Map(simulationMapSize);
            if (mapDisplaySimulation == 1) map.displayMap();
            for (Harvester simHero : heroes) {
                Move moveSimulation = new Move(map, simHero, csvWriter);
                moveSimulation.execute();
                simHero.resetPoints();
                // Sleep for 2 seconds after each hero's simulation
                Thread.sleep(1000);


            }
        }
        csvWriter.close(); // Closing PrintWriter
    }
}
