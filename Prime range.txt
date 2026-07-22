//Prime range

import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        System.out.println("Prime numbers are:");

        for(int num = start; num <= end; num++) {

            if(num > 1) {
                int count = 0;

                for(int i = 1; i <= num; i++) {
                    if(num % i == 0) {
                        count++;
                    }
                }

                if(count == 2) {
                    System.out.print(num + " ");
                }
            }
        }
    }
}