import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        String[] arr = {"посмотри", "слева", "справа", "сзади"};
        smash(arr);
    }

    //Напишите функцию, которая принимает массив слов, объединяет их в предложение и возвращает это предложение.
    public static String smash(String[] words) {
        String arrayToString = String.join(" ", words);
        System.out.println(arrayToString);
        return arrayToString;
    }
}

