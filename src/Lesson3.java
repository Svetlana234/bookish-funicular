public class Lesson3 {

    public static void main (String [] args) {
        printArray(invertArray());
        printArray(fillArray());
        printArray(changeArray());
        print2Array(fillDiagonal());
        printArray(createArray(5, 6));
    }

    // Вывод массива на печать
    public static void printArray (int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    // Вывод массива 2 на печать
    public static void print2Array (int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int y = 0; y < arr.length; y++) {
                System.out.print(arr[i][y]);
            }
            System.out.print(System.lineSeparator());
        }
    }

   //Задать целочисленный массив, состоящий из элементов 0 и 1.
   // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static int[] invertArray() {
        int[] arr = { 1, 0, 1, 0, 0, 1,0 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0) {
                arr[i]=1;

            } else if (arr[i]==1) {
                arr[i]=0;
            }
        }
        return arr;
    }

    //Задать пустой целочисленный массив длиной 100.
    // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static int[] fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
           arr[i] = i + 1;
        }
        return arr;
    }

    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static int[] changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i]= arr[i] *2;
            }
        }
        return arr;
    }

    // Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные
    // элементы единицами (можно только одну из диагоналей, если обе сложно).
    public static int[][] fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            arr[i][i] = 1;
        }
        return arr;
    }

    // Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
    // одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static int[] createArray (int len, int val) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = val;
        }
        return arr;
    }


}


