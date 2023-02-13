/* 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами. 
 */

import java.util.Scanner;
//import java.util.Arrays;;

public class task08 {

    private static int[][] diagonalOfSquareMatrix(String x) {
        int size = Integer.parseInt(x);
        int matrix[][] = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i == j) matrix[i][j] = 1;
                else if((i + j) == size - 1) matrix[i][j] = 1;
                else matrix[i][j] = 0;
            }
        }
    return matrix;    
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Введите размер квадратной матрицы: ");
        String x = myScanner.nextLine();
        myScanner.close();

        int[][] matrix = diagonalOfSquareMatrix(x);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("  " + matrix[i][j]);
            }
            System.out.println();
        }
    }
}