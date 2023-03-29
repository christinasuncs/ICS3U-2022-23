import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {
        int[] arr = new int[10];
        ArrayList<Integer> list = new ArrayList<Integer>(); // automatically resizes
        list.add(7);
        list.add(8);
        list.add(-1);

        list.add(1, 23);
        list.add(90);
        Integer stuff = list.remove(1);
        Integer stuff2 = list.set(1,99);

    }
}
