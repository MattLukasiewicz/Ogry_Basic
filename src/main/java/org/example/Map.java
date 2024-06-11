package org.example;


import java.util.Random;


class Map {
    private char[][] mapArray;

    private int mapSize;


    // Constructor that initializes the mapArray with a given size and generates a random map
    public Map(int mapSize) {
        this.mapSize = mapSize;
        mapArray = new char[mapSize][mapSize];
        randomMap();
    }

    // Method to display the mapArray on the screen
    public void displayMap() {
        System.out.println("Map:");
        for (int i = 0; i < mapSize; i++) { // Adjust loop to mapSize
            for (int j = 0; j < mapSize; j++) { // Adjust loop to mapSize
                System.out.print(mapArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public char[][] getMapArray() {
        return mapArray;
    }

    public int getMapSize() {
        return mapSize;
    }

    char[] symbols = {'W', 'J', 'B', '0'};

    public void randomMap() {
        Random random = new Random();
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                int randomIndex = random.nextInt(symbols.length);
                mapArray[i][j] = symbols[randomIndex];
            }
        }
    }
}