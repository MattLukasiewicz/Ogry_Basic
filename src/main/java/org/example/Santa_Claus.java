package org.example;
/**
 * The Santa_Claus class represents a specific type of Harvester with a unique superpower.
 */
public class Santa_Claus extends Harvester {
    /**
     * Constructs a Santa_Claus(hero) with the specified attributes.
     *
     * @param name                 the name of the hero(Santa Claus)
     * @param symbol               the symbol representing Santa Claus on the map
     * @param height               the height of Santa Claus
     * @param harvesting_accuracy  the accuracy of Santa Claus when harvesting
     */
    public Santa_Claus(String name, char symbol, int height, double harvesting_accuracy) {
        super(name, symbol, height, harvesting_accuracy);
    }
    /**
     * Applies Santa Claus's superpower to the specified tree.
     * If the height of the tree's fruits is less than 120, Santa Claus gains points.
     *
     * @param tree the tree on which the superpower is applied
     */
    @Override
    public void Superpower(Tree tree) {
        if(tree.heigh_of_the_fruits<120) {
            points+=tree.maxPoints();
        }
    }
}
