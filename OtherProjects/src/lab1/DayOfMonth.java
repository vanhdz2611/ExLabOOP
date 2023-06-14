package lab1;

import java.util.*;

public class DaysofMonth {
    public static boolean leap(int inyear) {
        if (inyear % 4 == 0) {
            if (inyear % 100 == 0) {
                if (inyear % 400 == 0) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }
    }
    public static int getMonth(String inmonth) {
        int month;
        switch (inmonth) {
            case "1":
            case "Jan":
            case "Jan.":
            case "January":
                month = 1;
                break;
            case "2":
            case "Feb":
            case "Feb.":
            case "February":
                month = 2;
                break;
            case "3":
            case "Mar":
            case "Mar.":
            case "March":
                month = 3;
                break;
            case "4":
            case "Apr":
            case "Apr.":
            case "April":
                month = 4;
                break;
            case "5":
            case "May.":
            case "May":
                month = 5;
                break;
            case "6":
            case "Jun":
            case "Jun.":
            case "June":
                month = 6;
                break;
            case "7":
            case "Jul":
            case "July.":
            case "July":
                month = 7;
                break;
            case "8":
            case "Aug":
            case "Aug.":
            case "August":
                month = 8;
                break;
            case "9":
            case "Sep":
            case "Sept.":
            case "September":
                month = 9;
                break;
            case "10":
            case "Oct":
            case "Oct.":
            case "October":
                month = 10;
                break;
            case "11":
            case "Nov":
            case "Nov.":
            case "November":
                month = 11;
                break;
            case "12":
            case "Dec":
            case "Dec.":
            case "December":
                month = 12;
                break;
        }
        return month;
    }
    
    public static int numberDayofMonth(int year, int month) {
        int days;
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                if (leap(year)) {
                    days = 29;
                }
                else {
                    days = 28;
                }
                break;
            default:
                days = 30;
        }
        return days;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Year ?");
        int inyear = scanner.nextInt();
        System.out.println("Month ?");
        String inmonth = scanner.nextLine();
        
        month = getMonth(inmonth);
        
        days = numberDayofMonth(inyear, month);
        System.out.println("There are " + days +" in" + month + "/" + inyear);
    }
}
