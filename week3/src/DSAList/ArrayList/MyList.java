package DSAList.ArrayList;

public class MyList<E> {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;


    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public void add(E e, int index) {
        Object temp[] = new Object[elements.length + 1];

        for (int i = 0; i < elements.length; i++) {
            if (i < index) {
                temp[i] = elements[i];
            } else if (i == index) {
                temp[i] = e;
            } else {
                temp[i] = elements[i - 1];
            }
        }
        elements = temp;
    }

    public void remove(int index) {
        Object[] temp = new Object[elements.length-1];
        for (int i = 0; i < elements.length; i++) {
            if (i < index) {
                temp[i] = elements[i];
            } else {
                temp[i] = elements[i + 1];
            }
        }
        elements = temp;
    }

    public void print() {
        System.out.print(elements[0]);
        for (int i = 1; i < elements.length; i++) {
            System.out.print(", " + elements[i]);
        }
        System.out.println();
    }
}
