/**
 * task06/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

 */
import java.util.Arrays;
import java.util.Random;
public class task06 {

    public static void main(String[] args) {
        Random r = new Random();

        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = r.nextInt(2);
        }    
        System.out.println(Arrays.toString(ints));
       
        for (int i = 0; i < ints.length; i++) {
            if(ints[i] == 0) ints[i] = 1;
            else ints[i] = 0;
        }
        System.out.println(Arrays.toString(ints));
    }


}