/*2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] 
пройти по нему циклом, и числа меньшие 6 умножить на 2;
 */

import java.util.Arrays;
import java.util.Random;


public class task07 {


    public static void main(String[] args) {
        Random r = new Random();

        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = r.nextInt(10);
        }    
        System.out.println(Arrays.toString(ints));
           
        for(int i = 0; i < ints.length; i++){
            if (ints[i] < 6) ints[i] = ints[i] * 2;
        }
        System.out.println(Arrays.toString(ints));

    }
}