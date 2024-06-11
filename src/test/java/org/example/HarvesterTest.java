package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HarvesterTest {
    private Harvester batman;
    private Harvester santaClaus;
    private Harvester shrek;
    private Tree appleTree;
    private Tree bananaTree;
    private Tree strawberryTree;

    @BeforeEach
    void setUp() {
        //creating objects
        batman = new Batman("Batman", '#', 190, 1.0);
        santaClaus = new Santa_Claus("Santa Claus", '@', 160, 1.0);
        shrek = new Shrek("Shrek", '%', 280, 1.0);
        appleTree = new Tree("apple_tree", 'J', 20, 200, 5);
        bananaTree = new Tree("banana_tree", 'B', 10, 330, 10);
        strawberryTree = new Tree("wild_strawberry_tree", 'W', 1000, 100, 1);
    }
    @Test
    void BatamnsSuperpower() {
        batman.Superpower(bananaTree);
        assertEquals(100, batman.points, "Batman should gain points when tree height > 230");
        //batman.points is equal now 100 and he should get 0 points from apple tree so he has still 100 points
        batman.Superpower(appleTree);
        assertEquals(100, batman.points, "Batman should not gain points when tree height <= 230");//he gains 100 because of height difference
    }
    @Test
    void testSantaClausSuperpower() {
        santaClaus.Superpower(strawberryTree);
        assertEquals(1000, santaClaus.points, "Santa Claus should gain points when tree height < 120");
        //now santa has 1000 points and he should get 0 points from bannana tree so he has still 1000 points
        santaClaus.Superpower(bananaTree);
        assertEquals(1000, santaClaus.points, "Santa Claus should not gain points when tree height >= 120");
    }

    @Test
    void testShrekSuperpower() {
        shrek.Superpower(appleTree);
        assertEquals(100, shrek.points, "Shrek should always gain points");

        shrek.Superpower(bananaTree);
        assertEquals(200, shrek.points, "Shrek should always gain points");
    }
    @Test
    void testTreesMaxPoints(){
        assertEquals(100,appleTree.maxPoints(),"Max points for apple tree should be 100");
        assertEquals(100,bananaTree.maxPoints(),"Max points for banana tree should be 100");
        assertEquals(1000,strawberryTree.maxPoints(),"Max points for strawberry tree should be 1000");
    }
    @Test
    void testResetPoints(){
        batman.points = 50;
        batman.resetPoints();
        assertEquals(0,batman.points,"Points should be reset to 0");
    }

}