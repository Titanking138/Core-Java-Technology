package lab2;

public class Multi {
    public static void main(String[] args) {
        System.out.println("Table is: ");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%5d", i * j);
            }
            System.out.println("");

        }

    }
}
