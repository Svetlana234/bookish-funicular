package hw2;

public class MyArrayDataException  extends  Exception {
    public MyArrayDataException(int i, int j) {
        super("проблема в элементе" + i+ "," + j);

    }
}
