//Automorphic

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;

        int temp = num;
        int count = 0;

        // count digits
        while(temp > 0) {
            count++;
            temp = temp / 10;
        }

        // find last digits of square
        int lastDigits = square % (int)Math.pow(10, count);

        if(lastDigits == num) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not Automorphic Number");
        }
    }
}
