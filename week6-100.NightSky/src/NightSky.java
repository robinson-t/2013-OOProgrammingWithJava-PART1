/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tom
 */
import java.util.Random;
public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starCounter;
    
    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }
    
    public NightSky(int width , int height) {
        this.density = 0.1;
        this.width = width;
        this.height = height;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    
    
    
    
    public void printLine() {
        Random random = new Random();
        double chance;
        for (int i = this.width ; i > 0 ; i--) {
            chance = random.nextDouble();
            if (chance <= this.density) {
                System.out.print("*");
                this.starCounter++;
            } else {
                System.out.print(" ");
            }
        } System.out.println("");
    }
    
    public void print() {
        this.starCounter = 0;
        for (int i = height ; i > 0 ; i--) {
            this.printLine();
        }
    }
    
    public int starsInLastPrint() {
        return starCounter;
    }
}
