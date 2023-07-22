import java.util.Arrays;

public class FibonacciNumbers {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
        System.out.println(Arrays.toString(fibonacciArr(10)));
    }

    public static String fibonacci(int numbers) {
        int firstNum = 0;
        int secondNum = 0;
        int thirdNum = 1;
        for (int i = 0; i < numbers; i++) {
            firstNum = secondNum;
            secondNum = thirdNum;
            thirdNum = firstNum + secondNum;
            System.out.print(firstNum + " ");
        } return "";
    }

    public static int[] fibonacciArr(int numbers) {
        int[] arr = new int[numbers];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        } return arr;
    }
}

