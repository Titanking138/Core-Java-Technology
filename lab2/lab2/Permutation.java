package lab2;

public class Permutation {
    public static void main(String s[]) {
        int i, j, k, l, t, r;
        System.out.println("With out repeate : ");

        for (i = 1; i <= 3; i++) {
            for (j = 2; j <= 4; j++) {
                for (k = 2; k <= 4; k++) {
                    for (l = 1; l <= 3; l++) {
                        t = compare(i, j, k, l);
                        if (t == 1) {
                            if (j > i && l < k) {
                                r = (i * 1000) + (j * 100) + (k * 10) + l;
                                System.out.println(r);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(" ");
        System.out.println("with reapeat :");

        for (i = 1; i <= 3; i++) {
            for (j = 2; j <= 4; j++) {
                for (k = 2; k <= 4; k++) {
                    for (l = 1; l <= 3; l++) {
                        if (j > i && l < k) {
                            r = (i * 1000) + (j * 100) + (k * 10) + l;
                            System.out.println(r);
                        }
                    }
                }
            }
        }
    }

    static int compare(int i, int j, int k, int l) {
        if (i != j && i != k && i != l) {
            if (j != k && j != l) {
                if (k != l) {
                    return 1;
                } else
                    return 0;
            } else
                return 0;
        } else
            return 0;
    }
}
