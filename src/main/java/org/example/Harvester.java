package org.example;
/**
 * The Harvester class represents a hero that can harvest fruits from trees.
 */
public class Harvester {
    String name;
    char symbol;
    int height;
    double harvesting_accuracy;
    double points = 0.0;

    /**
     * Constructs a new Harvester with the specified attributes.
     *
     * @param name                 the name of the harvester
     * @param symbol               the symbol representing the harvester on the map
     * @param height               the height of the harvester
     * @param harvesting_accuracy  the accuracy of the harvester when harvesting
     */
    public Harvester(String name, char symbol, int height, double harvesting_accuracy) {
        this.name = name;
        this.symbol = symbol;
        this.height = height;
        this.harvesting_accuracy = harvesting_accuracy;
    }
    /**
     * The superpower method that can be overridden by subclasses to provide specific superpower behaviors.
     *
     * @param tree the tree on which the superpower is applied
     */
    public void Superpower(Tree tree) {
        // Default implementation that can be overridden by subclasses
    }
    /**
     * Resets the points of the harvester to 0.
     */
    public void resetPoints() {
        this.points = 0.0;
    }
}
