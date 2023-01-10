public class DoubleCycle {
    public static void main(String[] args) {

//         Как сделать, чтобы двойной цикл печатал таблицу из * размером 6х6, и чтобы между
//звездочками стояли пробелы
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("------------");

//        сделать так, чтобы правая половина этой таблицы состояла
//бы не из *, а из 0. Добавим для этого условие.
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j < 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        System.out.println("------------");

//         Сделать так, чтобы по краям квадрата стояли 0, а внутри он был бы заполнен *.
//Для этого необходимо проверять, если номер строки или столбца равен 0 или (размер таблицы - 1),
//тогда ставим 0, в противном случае *
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || i == 5 || j == 0 || j == 5) {
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        System.out.println("------------");

//       заполнить таблицу в шахматном порядке.
//  % это вычисление остатка от деления.
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }

}
