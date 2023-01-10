public class HomeWork2 {
    public static void main(String[] args) {
//        boolean result = checkSumSign(5, 10);
//        System.out.println(result);
//        checkNum(0);
//        boolean result = CompareSigns(4);
//        System.out.println(result);
        PrintLine("hello", 8);

    }
// Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false.
    public static boolean checkSumSign(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

//    Написать метод, которому в качестве параметра передается целое число,
//    метод должен напечатать в консоль, положительное ли число передали
//    или отрицательное. Замечание: ноль считаем положительным числом.
    public static void checkNum(int n) {
        if (n >= 0) {
            System.out.println("число положительное");
        } else {
            System.out.println("число отрицательное");
        }
    }

//     Написать метод, которому в качестве параметра передается целое число.
//     Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean CompareSigns(int a) {
        return a < 0;
    }

//    Написать метод, которому в качестве аргументов передается строка и число,
//    метод должен отпечатать в консоль указанную строку, указанное количество раз
    public static void PrintLine(String str, int n) {
        for (int i = 1; i <= n; i++){
            System.out.println("[" + i + "]" + str);
        }
    }

}
