/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tom
 */
import java.util.ArrayList;
public class BirdCollection {
    private ArrayList<Bird> birdCollection;

    public BirdCollection() {
        birdCollection = new ArrayList<Bird>();
    }
    
    public void addBird(Bird newBird) {
        birdCollection.add(newBird);
    }
    
    public void statistics() {
        for (Bird bird : birdCollection) {
            System.out.println(bird);
        }
    }
    
    public boolean inCollection(String name) {
        for (Bird bird : this.birdCollection) {
            if (bird.getName().equals(name)) {
                return true;
            } else if (bird.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    public void addSighting(String name) {
        for (Bird bird : this.birdCollection) {
            if (bird.getName().equals(name)) {
                bird.observation();
            }
        }
    }
    
    public void printBird(String name) {
        for (Bird bird : this.birdCollection) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
            }
        }
    }
    
}
