import java.util.Random;
import java.util.Scanner;

public class Lesson4 {

    public static int MAP_SIZE = 3; // РАЗМЕР ПОЛЯ, ВКЛЮЧАЯ ПРОВЕРКУ
    public static final char EMPTY_CELL = '•';
    public static final char X_CELL = 'X';
    public static final char Y_CELL = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (isWinTurn(X_CELL)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (isWinTurn(Y_CELL)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    /**
     * Проверка победы
     * @param symb
     * @return
     */
    public static boolean isWinTurn(char symb) {
        for (int i =0 ; i< MAP_SIZE; i++) {
            boolean canWin = true;
            for (int y =0 ; y< MAP_SIZE; y++) {
                if (map[i][y] != symb) {
                    canWin = false;
                }
            }
            if (canWin) {
                return true;
            }
        }
        for (int i =0 ; i< MAP_SIZE; i++) {
            boolean canWin = true;
            for (int y =0 ; y< MAP_SIZE; y++) {
                if (map[y][i] != symb) {
                    canWin = false;
                }
            }
            if (canWin) {
                return true;
            }
        }
        return false;
    }

    /**
     * Контроль полноты карты
     * @return
     */
    public static boolean isMapFull() {
        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                if (map[i][j] == EMPTY_CELL) return false;
            }
        }
        return true;
    }

    /**
     * Ход компьютера
     */
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(MAP_SIZE);
            y = rand.nextInt(MAP_SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = Y_CELL;
    }

    /**
     * Ход человека
     */
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = X_CELL;
    }

    /**
     * Контроль возможности сходить в ячейку
     * @param x
     * @param y
     * @return
     */
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= MAP_SIZE || y < 0 || y >= MAP_SIZE) return false;
        if (map[y][x] == EMPTY_CELL) return true;
        return false;
    }

    /**
     * Инициализация поля
     */
    public static void initMap() {
        map = new char[MAP_SIZE][MAP_SIZE];
        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                map[i][j] = EMPTY_CELL;
            }
        }
    }

    /**
     * Вывод карты в конс
     */
    public static void printMap() {
        for (int i = 0; i <= MAP_SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < MAP_SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < MAP_SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
