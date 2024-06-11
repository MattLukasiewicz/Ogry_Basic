package org.example;
/**
 * The Tree class represents a tree with fruits that can be harvested by a Harvester.
 */
public class Tree {

    String name;
    char symbol;
    int quantity_of_fruit;
    int heigh_of_the_fruits;
    int points;
    /**
     * Returns the maximum points that can be obtained from the tree.
     *
     * @return the maximum points from the tree
     */
    int maxPoints()
    {
        return quantity_of_fruit*points;
    }

    /**
     * Constructs a new Tree with the specified attributes.
     *
     * @param name                the name of the tree
     * @param symbol              the symbol representing the tree on the map
     * @param quantity_of_fruit   the quantity of fruits on the tree
     * @param heigh_of_the_fruits the height of the fruits on the tree
     * @param points              the points value of the fruits
     */
    public Tree(String name, char symbol, int quantity_of_fruit, int heigh_of_the_fruits, int points){
        this.name=name;
        this.symbol=symbol;
        this.quantity_of_fruit=quantity_of_fruit;
        this.heigh_of_the_fruits=heigh_of_the_fruits;
        this.points=points;
    }
}
