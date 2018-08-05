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
import java.text.*;
public class GradeHandler {
    private final ArrayList<Integer> grades;
    private int five;
    private int four;
    private int three;
    private int two;
    private int one;
    private int zero;
    private double percentage;

    public GradeHandler(ArrayList<Integer> grades) {
        this.grades = grades;
        percentageCalculate();
        sort();        
        

    }
    
    public void sort() {
        for (int i : grades) {
            if (i <= 29) {
                this.zero++;
            } else if (i <= 34) {
                this.one++;
            } else if (i <= 39) {
                this.two++;
            } else if (i <= 44) {
                this.three++;
            } else if (i <= 49) {
                this.four++;
            } else {
                this.five++;
            }
        }
    }
    
    public void printStars(int noOf) {
        for (int i = noOf ; i > 0 ; i--) {
            System.out.print("*");
        }
        System.out.println("");
    }
    
    public void percentageCalculate() {
        int total = 0;
        int pass = 0;
        for (int i : this.grades) {
            if (i > 29 ) {
                pass++;
            }
            total++;
        }
        this.percentage = (pass / (double)total) * 100;
    }
    
    public void print() {
        DecimalFormat oneDigit = new DecimalFormat("#,##0.0");
        System.out.println("Grade distribution:");
        System.out.print("5: ");
        printStars(this.five);
        System.out.print("4: ");
        printStars(this.four);
        System.out.print("3: ");
        printStars(this.three);
        System.out.print("2: ");
        printStars(this.two);
        System.out.print("1: ");
        printStars(this.one);
        System.out.print("0: ");
        printStars(this.zero);
        
        System.out.print("Acceptance percentage: " + oneDigit.format(this.percentage));
    }
    
    
    
    
    
    
    
}
