package Threading.taothreaddongian;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator();
        numberGenerator1.start();

        NumberGenerator numberGenerator2 = new NumberGenerator();
        numberGenerator2.start();
    }
}
