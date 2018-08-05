
public class NumberStatistics {
    
    private int amountOfNumbers;
    private int sum;
    
    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;
    }
    
    public void addNumber(int number) {
        this.amountOfNumbers++;
        this.sum += number;
    }
    
    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }
    
    public int sum() {
        return this.sum;
    }
    
    public double average() {
        if ((amountOfNumbers > 0) && (sum > 0)) {
            return sum() / (double)amountOfNumbers;
        } else {
            return 0;
        }
    }
}
