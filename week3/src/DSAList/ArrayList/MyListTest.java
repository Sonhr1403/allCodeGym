package DSAList.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>(5);
        listInteger.add(1,0);
        listInteger.add(2,1);
        listInteger.add(3,2);
        listInteger.add(3,3);
        listInteger.add(4,4);

        listInteger.print();

        listInteger.add(5,1);
        listInteger.add(7,3);

        listInteger.print();

        listInteger.remove(5);

        listInteger.print();
    }
}
