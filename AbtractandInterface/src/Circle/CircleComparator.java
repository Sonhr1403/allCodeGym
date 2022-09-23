package Circle;

import java.util.Comparator;

public class CircleComparator implements IComparator<Circle>, Comparator {

    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
