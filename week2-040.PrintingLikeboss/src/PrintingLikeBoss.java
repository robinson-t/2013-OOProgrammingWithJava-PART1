public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while (amount > 0) {
            System.out.print("*");
            amount--;
        } System.out.print("\n");
    }

    public static void printWhitespaces(int amount) {
        while (amount > 0) {
            System.out.print(" ");
            amount--;
        }
    }

    public static void printTriangle(int size) {
        int white = size - 1;
        int stars = 1;
        while (size > 0) {
            printWhitespaces(white);
            printStars(stars);
            size--;
            white--;
            stars++;
        }
    }

    public static void xmasTree(int height) {
        int white = height - 1;
        int stars = 1;
        int base = height - 2;
        while (height > 0) {
            printWhitespaces(white);
            printStars(stars);
            white--;
            stars += 2;
            height--;
        } 
        printWhitespaces(base);
        printStars(3);
        printWhitespaces(base);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
