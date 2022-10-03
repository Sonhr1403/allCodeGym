package Threading.HienThiSoChanLe;

public class EvenThread extends Thread {
 public void run() {
     for (int i = 1; i < 11; i++) {
         try {
             Thread.sleep(15);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
         if (i % 2 == 0) {
             System.out.println(i);
         }
     }
 }
}
