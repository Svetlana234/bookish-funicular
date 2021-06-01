package hw2;

public class MyArraySizeException  extends  Exception {
    public MyArraySizeException(int i) {
        super("проблема в строке" +i);

    }
}
