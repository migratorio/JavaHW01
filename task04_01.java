/* Найти общий префикс среди слов из одного массива.
 * ["aaa", "aab", "aa"] -> "aa", ["abc", "bca", "cda"] -> ""
 */

// V.01 - с созданием двухмерного массива

public class task04_01 {
    private static String findCommonPrefix(String[] stringArray2) {
        char[][] tempArr = new char[stringArray2.length][3];
        String prefix = "";
        for (int i = 0; i < stringArray2.length; i++) {
            char[] strToArray = stringArray2[i].toCharArray();
            for(int j = 0; j < strToArray.length; j++) {
                tempArr[i][j] = strToArray[j];

            }
        }

        for (int i = 0; i < tempArr.length; i++) {    // вывод на печать
            for (int j = 0; j < tempArr.length; j++) {
                System.out.print("  " + tempArr[i][j]);
            }
            System.out.println();
        }
        char symbol = ' ';
        int k = 0;
        L1:

        while (k < 2) {
        for (int i = 0; i < tempArr.length - 1; i++) {
                if (tempArr[i][k] != tempArr[i+1][k]) break L1;
                else {
                    symbol = tempArr[i][k];
                }   
        }    
            prefix = prefix + symbol;
        k++;
        }
        
    return prefix;
    }

    public static void main(String[] args) {
        String[] stringArray2 = {"asc", "aba", "aba"};
        System.out.println(findCommonPrefix(stringArray2));
    }
}
