import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        String[] arr = {"посмотри", "слева", "справа", "сзади"};
        smash(arr);

        String str = "hello";
        System.out.println(remove(str));
    }

    //Напишите функцию, которая принимает массив слов, объединяет их в предложение и возвращает это предложение.
    public static String smash(String[] words) {
        String arrayToString = String.join(" ", words);
        System.out.println(arrayToString);
        return arrayToString;
    }


    // создать функцию, которая удаляет первый и последний символы строки
    public static String remove(String str) {
    String str2 = str.substring(1, str.length() - 1);
        return str2;
    }
}

