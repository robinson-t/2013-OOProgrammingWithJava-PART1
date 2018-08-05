
public class Main {
    
    public static int smallest(int[] array) {
        int currentSmall = array[0];
        for (int i = 0 ; i < array.length ; i++) {
            if (array[i] < currentSmall) {
                currentSmall = array[i];
            }
        }
        return currentSmall;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        int currentSmall = array[0];
        int currentIndex = 0;
        for (int i = 0 ; i < array.length ; i++) {
            if (array[i] < currentSmall) {
                currentSmall = array[i];
                currentIndex = i;
            }
        }
        return currentIndex;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array , int start) {
        int currentSmallest = array[start];
        int currentIndex = start;
        for (int i = start ; i < array.length ; i++){
            if (currentSmallest > array[i]) {
                currentSmallest = array[i];
                currentIndex = i;
            }
        }
        return currentIndex;
    }
   
    public static void swap(int[] array , int index1 , int index2) {
        int newValue1 = array[index2];
        int newValue2 = array[index1];
        
        array[index1] = newValue1;
        array[index2] = newValue2;
    }
    
    public static void sort(int[] array) {
        int start = 0;
        int counter = 0;
        for (int i = 0 ; i < array.length ; i++) {
            swap(array , indexOfTheSmallestStartingFrom(array, counter) , start);
            start++;
            counter++;
            print(array);
        }
    }
    
    public static void main(String[] args) {
        
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }
    
    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0 ; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
        System.out.println("");
    }

}
