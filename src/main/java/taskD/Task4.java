package taskD;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    static Month temp = Month.JANUARY;
    public static final Logger LOGGER = LogManager.getLogger(Task4.class);
    public static Month findMonth(String month, List<Month> monthsList){
        for (Month tempMonth : monthsList) {
            if (month.equalsIgnoreCase(tempMonth.name())) {
                temp = tempMonth;
            }
        }
        return temp;
    }
    public static boolean checkMonth(String month, List<Month> monthsList){
        int count = 0;
        for (Month months: monthsList){
            if (month.equalsIgnoreCase(months.name())){
                count++;
            }
        }
        if (count == 0) return false;
        return true;
    }
    public static void season(String month, List<Month> monthsList){
        temp = findMonth(month, monthsList);
        for (Month months : monthsList) {
            if (temp.getSeasons().equals(months.getSeasons())) {
                LOGGER.info(months.name());
            }
        }
    }
    public static void evenNumberOfDaysInMonth(List<Month> monthsList){
        for (Month months : monthsList){
            if(months.getDays()%2==0) {
                LOGGER.info(months.name() + " " +months.getDays());
            }
        }
    }
    public static void oddNumberOfDaysInMonth(List<Month> monthsList){
        for (Month months : monthsList){
            if(months.getDays()%2 != 0) {
                LOGGER.info(months.name() + " " +months.getDays());
            }
        }
    }
    public static void OddOrEvenDays(String month, List<Month> monthsList){
        if (!checkMonth(month, monthsList)){
            LOGGER.info("No");
        }
        else {
            for(Month months : monthsList){
                if (month.equalsIgnoreCase(months.name())) temp = months;
            }
            if (temp.getDays()%2 == 0) LOGGER.info("Even");
            else LOGGER.info("Odd");
        }
    }

    public static void sameDays(String month, List<Month> monthsList){
        if (!checkMonth(month, monthsList)){
            LOGGER.info("No");
        }
        else {
            for(Month months : monthsList){
                if (month.equalsIgnoreCase(months.name())) temp = months;
            }
            for (Month months : monthsList){
                if(months.getDays()== temp.getDays()){
                    if (!months.name().equals(temp.name())) LOGGER.info(months.name());
                }
            }
        }
    }

    public static void menu(){
        LOGGER.info("1 - Check if there is such a month.");
        LOGGER.info("2 - Display all months that have the same number of days.");
        LOGGER.info("3 - Display all months that have the same number of days.");
        LOGGER.info("4 - Display all months with an even number of days.");
        LOGGER.info("5 - Display all months with an odd number of days.");
        LOGGER.info("6 - Display whether the month entered from the console has an even number of days.");
        LOGGER.info("0 - Exit");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Month> monthsList = new ArrayList<>(Arrays.asList(Month.values()));
        LOGGER.info("Enter month - ");
        String month = in.nextLine();
        int choice;
        do {
            menu();
            LOGGER.info("Enter a number- ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    LOGGER.info("Check if there is such a month");
                    if (!checkMonth(month, monthsList)){
                        LOGGER.info("Month not found.");
                    }
                    else LOGGER.info("Month found.");
                    break;
                case 2:
                    LOGGER.info("Display all months with the same season.");
                    season(month,monthsList);
                    break;
                case 3:
                    LOGGER.info("Display all months that have the same number of days.");
                    sameDays(month, monthsList);
                    break;
                case 4:
                    LOGGER.info("Display all months with an even number of days.");
                    evenNumberOfDaysInMonth(monthsList);
                    break;
                case 5:
                    LOGGER.info("Display all months with an odd number of days.");
                    oddNumberOfDaysInMonth(monthsList);
                    break;
                case 6:
                    LOGGER.info("Display whether the month entered from the console has an even number of days.");
                    OddOrEvenDays(month,monthsList);
                    break;
            }
        } while (choice != 0);
        LOGGER.info("Thank you! Hope to see you again:)");
    }
}
