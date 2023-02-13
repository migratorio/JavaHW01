//проверить, является ли год високосным. если да - return true


import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class task05 {

    public static boolean isLeapYear(int year) {
        GregorianCalendar calendar = new GregorianCalendar(year, Calendar.FEBRUARY, 29); //Вводим дату 29 февраля
        if(calendar.get(Calendar.MONTH) == 2) return false;  // если возвращается МАРТ, год не високосный
        else return true;
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите год для проверки на високосность: ");
        String x = iScanner.nextLine();
        int year = Integer.parseInt (x);
        iScanner.close();
        System.out.println(isLeapYear(year));
    }
}