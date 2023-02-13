// напечатать строку source repeat раз
import java.util.Scanner;
public class task02 {
    
    private static void printString(String source, int i) {
            System.out.printf("Строка: %s", source.repeat(i));
        }      


    public static void main(String[] args) {
        //region name
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите строку: ");
        String source = iScanner.nextLine();
        
        System.out.printf("Введите количество повторений: ");
        String repeat = iScanner.nextLine();
        int i = Integer.parseInt (repeat);
        iScanner.close();

        printString(source, i);       
    }   
}
