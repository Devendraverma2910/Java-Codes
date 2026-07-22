//Swap without third variable

public class SwapWithoutTemp {
    public static void main(String[] args) {

        int a = 5, b = 10;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a + b;  // a = 15
        b = a - b;  // b = 5
        a = a - b;  // a = 10

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}