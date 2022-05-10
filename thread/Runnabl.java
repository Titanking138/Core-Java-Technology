

public class Runnabl implements Runnable {
    Thread t;

    Runnabl() {
        t = new Thread(this, "Kevla");
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("kevla : " + i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
           
            System.out.println(e);

        }
    }

    public static void main(String[] args) {
        new Runnabl();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Main : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            
            System.out.println(e);

        }
    }

}
