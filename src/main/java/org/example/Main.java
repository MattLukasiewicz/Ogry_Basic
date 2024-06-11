package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter csvWriter = new PrintWriter(new FileWriter("simulation_results.csv"));
        csvWriter.println("Hero;Apple Trees;Banana Trees;Wild Strawberry Trees;Max Points;Hero Points");

        int howManySimulations = 10;
        int mapDisplaySimulation = 0; // 1 display 0 no
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
            }
        }
        csvWriter.close(); // Zamknięcie PrintWriter
    }
}