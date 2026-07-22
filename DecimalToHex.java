//Decimal to hex


import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int num = sc.nextInt();

        String hex = "";

        while(num > 0) {
            int rem = num % 16;

            if(rem < 10) {
                hex = rem + hex;
            } else {
                hex = (char)(rem - 10 + 'A') + hex;
            }

            num = num / 16;
        }

        System.out.println("Hexadecimal = " + hex);
    }
}