/**
 * task01/**
 * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
 * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 */
import java.util.Scanner;
public class task01 {

    private static boolean isSumBetween10And20(int a, int b) {
    // проверить, что сумма a и b лежит между 10 и 20
        if((a + b) <= 20 && (a + b) >= 10) return true;
        else return false;                
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        System.out.printf("Введите число a: ");
        String x = iScanner.nextLine();
        int a = Integer.parseInt (x);

        System.out.printf("Введите число b: ");
        String y = iScanner.nextLine();
        int b = Integer.parseInt (y);

        iScanner.close();

        System.out.printf("Принадлежность введённых чисел к диапазону <10 - 20>: %s", isSumBetween10And20(a, b));
    }
}