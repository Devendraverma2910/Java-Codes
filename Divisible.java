//Divisible 5 & 11

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num % 5 == 0 && num % 11 == 0) {
            System.out.println("Number is divisible by 5 and 11");
        } else {
            System.out.println("Number is NOT divisible by 5 and 11");
        }
    }
}