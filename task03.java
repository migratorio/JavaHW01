// Проверка числа на неотрицательность
import java.util.Scanner;
public class task03 {

    private static boolean isPositive(int x) {
        if(x < 0) return false;
       else return true;
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        String number = iScanner.nextLine();
        int x = Integer.parseInt (number);
        iScanner.close();
        System.out.printf("Проверка числа " + x + " на неотрицательность: %s", isPositive(x));   
    }
}