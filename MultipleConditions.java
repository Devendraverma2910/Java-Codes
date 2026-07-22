//MultipleConditions

import java.util.Scanner;

public class MultipleConditions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Are you citizen? (true/false): ");
        boolean citizen = sc.nextBoolean();

        if(age >= 18 && citizen) {
            System.out.println("Eligible for voting");
        } else {
            System.out.println("Not eligible for voting");
        }
    }
}