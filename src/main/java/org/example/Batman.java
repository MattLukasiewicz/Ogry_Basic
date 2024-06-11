package org.example;

/**
 * The Batman class represents a specific type of Harvester with a unique superpower.
 */
public class Batman extends Harvester {
    /**
     * Constructs a Batman(hero) with the specified attributes.
     *
     * @param name                 the name of the hero(Batman)
     * @param symbol               the symbol representing Batman on the map
     * @param height               the height of Batman
     * @param harvesting_accuracy  the accuracy of Batman when harvesting
     */
    public Batman(String name, char symbol, int height, double harvesting_accuracy) {
        super(name, symbol, height, harvesting_accuracy);
    }

    /**
     * Applies Batman's superpower to the specified tree.
     * If the height of the tree's fruits is greater than 230, Batman gains points.
     *
     * @param tree the tree on which the superpower is applied
     */
    @Override
    public void Superpower(Tree tree) {
        if(tree.heigh_of_the_fruits>230) {
            points+=tree.maxPoints();
        }
    }
}
