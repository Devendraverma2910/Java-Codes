//Nested if

//if(condition1) {
   // if(condition2) {
        // code
   // }
//}


import java.util.Scanner;

public class NestedIfExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if(num > 0) {
            if(num % 2 == 0) {
                System.out.println("Positive Even Number");
            } else {
                System.out.println("Positive Odd Number");
            }
        } else {
            System.out.println("Number is not positive");
        }
    }
}