import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int value : list) {
            sum += value;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        int i = 0;
        for (int value : list) {
            i++;
        }
        double average = (double)sum(list) / i;
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        double totalsofar = 0;
        double mean = average(list);
        System.out.println(mean);
        double current;
        int counter = 0;
        for (double i : list) {
            current = i - mean;
            current = current * current;
            totalsofar += current;
            counter++;
            
        } 
        double varience = totalsofar / (counter -1);
        return varience;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
