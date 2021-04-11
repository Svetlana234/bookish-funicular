public class Lesson2 {


    public static void main (String [] args) {
        System.out.println(within10and20(5, 7));
        isPositiveOrNegative(-6);
        System.out.println(isNegative(-6));
        printWordNTimes("We are the champions!", 3);
    }

    //Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
    // от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean within10and20(int x1, int x2) {
        if (x1 +x2 >=10 && x1 +x2 <=20) {
            return true;
        } else {
            return false;
        }
    }

    // Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    // Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        }
        return false;
    }

    //  Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать
    //  в консоль указанную строку, указанное количество раз;
    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }










}
