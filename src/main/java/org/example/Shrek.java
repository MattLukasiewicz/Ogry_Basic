package org.example;
/**
 * The Shrek class represents a specific type of Harvester with a unique superpower.
 */
public class Shrek extends Harvester {
    /**
     * Constructs a new Shrek with the specified attributes.
     *
     * @param name                 the name of the hero(Shrek)
     * @param symbol               the symbol representing Shrek on the map
     * @param height               the height of Shrek
     * @param harvesting_accuracy  the accuracy of Shrek when harvesting
     */
    public Shrek(String name, char symbol, int height, double harvesting_accuracy) {
        super(name, symbol, height, harvesting_accuracy);
    }
    /**
     * Applies Shrek's superpower to the specified tree.
     * Shrek always gains points from the tree.
     *
     * @param tree the tree on which the superpower is applied
     */
    @Override
    public void Superpower(Tree tree) {
        points += tree.maxPoints();
    }
}
