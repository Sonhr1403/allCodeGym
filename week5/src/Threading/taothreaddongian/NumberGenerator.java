package Threading.taothreaddongian;

public class NumberGenerator implements Runnable{
    private Thread t;
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Printing the hashcode: " + hashCode());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("End!");
            throw new RuntimeException(e);
        }
    }

    void start() {
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }
}
