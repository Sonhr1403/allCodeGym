package Threading.HienThiSoChanLe;

public class TestThread {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        oddThread.start();
        try {
            oddThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        evenThread.start();
    }
}
