import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Напишите Java-программу, чтобы определить, является ли строка или число палиндромом, или нет
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String string = sc.nextLine();
        System.out.println(isPalindrome(string));
    }
    public static String isPalindrome(String str) {
        String stringRevers = revers(str);
        if (str.equals(stringRevers)) {
            return "это палиндром \uD83D\uDE0E";
        } else {
            return "это не палиндром \uD83D\uDE12";
        }
    }

        public static String revers(String str) {
            StringBuilder stB = new StringBuilder();
            stB.append(str);
            stB = stB.reverse();
            String str2 = stB.toString();
            return str2;
        }
    }

