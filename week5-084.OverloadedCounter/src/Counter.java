/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tom
 */
public class Counter {
    private int currentValue;
    private boolean check;
    
    public Counter(int startingValue, boolean check) {
        this.currentValue = startingValue;
        this.check = check;
    }
    
    public Counter(boolean check) {
        this(0 , check);
    }
    
    public Counter(int startingValue) {
        this(startingValue, false);
    }
    
    public Counter() {
        this(0 , false);
    }
    
    public int value() {
        return this.currentValue;
    }
    
    public void decrease() {
        this.decrease(1);
    }
    
    public void increase() {
        this.currentValue++;
    }
    
    public void increase(int amount) {
        if (amount > 0) {
            this.currentValue += amount;
        }
    }
    
    public void decrease(int amount) {
        if ((!check) && (amount > 0)) {
            this.currentValue -= amount;
        } else if ((currentValue > 0) && (amount > 0)){
            this.currentValue -= amount;
        } 
        if ((this.currentValue < 0) && (check)) {
            currentValue = 0;
        }
        
        
    }
}
