/*4. Задать одномерный массив и найти в нем минимальный и максимальный элементы
 */


import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class task09 {

    public static int[] getMaxMinFromArray(Integer size) {
        Random r = new Random();
         int[] ints = new int[size];
         for (int i = 0; i < ints.length; i++) {
            ints[i] = r.nextInt(100);
         }
        System.out.println(Arrays.toString(ints));
        int minX = ints[0];
        int maxX = ints[0];

        for (int i = 0; i < ints.length; i++) {
            if(ints[i] < minX) minX = ints[i];
            else if(ints[i] > maxX) maxX = ints[i];
    }
        return new int[] {minX, maxX};
    }
    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Введите размер массива: ");
        String x = myScanner.nextLine();
        int size = Integer.parseInt (x);
        myScanner.close();

        int[] result = getMaxMinFromArray(size);
        System.out.printf("MIN заданного массива: %s", result[0]);    
        System.out.printf("\nMAX заданного массива: %s", result[1]);
    } 
}