/* Найти общий префикс среди слов из одного массива.
 * ["aaa", "aab", "aa"] -> "aa", ["abc", "bca", "cda"] -> ""
 */

 // V.02 - без создания дополнительного массива
// import java.util.Scanner;
public class task04_02 {
    private static String findCommonPrefix(String[] stringArray2) {
        char symbol = ' ';
        int k = 3; // длина строки
        String prefix = "";
        L1:
        for (int j = 0; j < k; j++) {
            for (int i = 0; i < stringArray2.length - 1; i++) {                
                if(stringArray2[i].charAt(j) != stringArray2[i + 1].charAt(j)) break L1; 
                else {
                    symbol = stringArray2[i].charAt(j);
                }
            }
            prefix = prefix + symbol;
        }
        if(prefix == "") prefix = "отсутствует";
        return prefix;
    }

    public static void main(String[] args) {
        String[] stringArray2 = {"abs", "abc", "abc", "abb"};
        for(int i = 0; i < stringArray2.length; i++){
            System.out.println(stringArray2[i]);
        }
        System.out.printf("Префикс введённых строк: %s", findCommonPrefix(stringArray2));
    }
}