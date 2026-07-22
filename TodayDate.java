// Print today's date

import java.time.LocalDate;

public class TodayDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);
    }
}