
public class BoundedCounter {
    private int currentValue;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
    }
    
    public void setValue(int value) {
        if ((value >= 0) && (value <= upperLimit)) {
            this.currentValue = value;
        }
    }
    
    public int getValue() {
        return this.currentValue;
    }
    
    public void next() {
        if (this.currentValue < this.upperLimit) {
            this.currentValue++;
        } else {
            this.currentValue = 0;
        }
    }

    @Override
    public String toString() {
        if (this.currentValue < 10) {
            return "0" + currentValue;
        } else {
            return "" + currentValue;
        }
    }
    
    
    
    
}
