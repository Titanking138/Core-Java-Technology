package thread;

// import java.lang.*;

public class Thre extends Thread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(" " + t);
        t.setName("Kevla");
        System.out.println(" " + t);
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
           
            System.out.println(e);

        }

    }
}
