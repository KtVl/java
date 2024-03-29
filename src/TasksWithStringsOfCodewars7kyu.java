import java.util.Arrays;

public class TasksWithStringsOfCodewars7kyu {
    public static void main(String[] args) {
        System.out.println(switcheroo("aabbcc"));
        System.out.print(delimitedWord("hello", "!", 3));
        System.out.println(reverseWords("This is an example!"));
        System.out.println(highAndLow("6 5 3 1 9"));
    }

    /*Дана строка, состоящая из букв a, b и/или c, поменяйте местами буквы a и b (замените a на b и наоборот).*/
    public static String switcheroo(String x) {
        return x.replace('a','0').replace('b','a').replace('0','b');
    }

    //вывести слово повторенное число раз с разделителем из второго параметра
    public static String delimitedWord(String str, String separator, int num) {
        String newStr = new String();
        for (int i = 0; i < num; i++){
            newStr += str + separator;
        } return newStr;
    }

    /*напишите функцию, которая принимает строковый параметр и переворачивает каждое слово в строке.
    Все пробелы в строке должны быть сохранены.
    Примеры
    "This is an example!" ==> "sihT si na !elpmaxe"
    "double  spaces"      ==> "elbuod  secaps"*/
    public static String reverseWords(final String original) {
        String[] words = new StringBuilder(original).reverse().toString().split(" ");
        StringBuilder newStr = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--)
            newStr.append(words[i]).append(" ");
        String str = newStr.toString();
        return str;
    }

    //вам дается строка чисел, разделенных пробелами, и вы должны вернуть наибольшее и наименьшее число.
    public static String highAndLow(String numbers) {
        String[] stringsArr = numbers.split(" ");
        int[] numbersArr = new int[stringsArr.length];
        for (int i = 0; i < stringsArr.length; i++) {
            numbersArr[i] = Integer.parseInt(stringsArr[i]);
        }
        Arrays.sort(numbersArr);
        return numbersArr[numbersArr.length-1] + " " + numbersArr[0];
    }
}
