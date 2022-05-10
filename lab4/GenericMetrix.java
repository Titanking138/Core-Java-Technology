// package lab4;

import java.util.Scanner;

class GenericMetrixFunctions {
    private Object matrix[][];

    public GenericMetrixFunctions(Object matrix[][]) {
        this.matrix = matrix;
    }

    public Object[][] addMatrix(Object matrix[][]) {
        Object result[][] = new Object[matrix.length][matrix[0].length];
        if ((this.matrix.length != matrix.length) || (this.matrix[0].length != matrix[0].length)) {
            System.out.println("Matrixs are not same size.......");
            System.exit(0);
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = add(this.matrix[i][j], matrix[i][j]);
            }
        }
        return result;

    }

    public Object[][] multiplymatrix(Object matrix[][]) {
        Object result[][] = new Object[this.matrix.length][matrix[0].length];
        if (this.matrix[0].length != matrix.length) {
            System.out.println("Bound Error........");
            System.exit(0);
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = zero();
                for (int k = 0; k < this.matrix[0].length; k++) {
                    result[i][j] = add(result[i][j], multiply(this.matrix[i][k], matrix[k][j]));
                }
            }
        }
        return result;
    }

    public Object zero() {
        return null;
    }

    public Object add(Object object, Object multiply) {
        return null;
    }

    public Object multiply(Object o1, Object o2) {
        return null;
    }

}

class SingleMatrix extends GenericMetrixFunctions {

    public SingleMatrix(Integer[][] matrix) {
        super(matrix);
    }

    public Object zero() {
        Integer integer = Integer.valueOf(0);
        return integer;
    }

    public Object add(Object object, Object multiply) {
        Integer integer1 = (Integer) object;
        Integer integer2 = (Integer) multiply;
        integer1 = integer1.intValue() + integer2.intValue();
        return integer1;
    }

    public Object multiply(Object o1, Object o2) {
        Integer integer1 = (Integer) o1;
        Integer integer2 = (Integer) o2;
        integer1 = integer1.intValue() * integer2.intValue();
        return integer1;
    }

}

/**
 * GenericMetrix
 */
public class GenericMetrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Integer[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // Integer[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("Enter row size : ");
        int n = scanner.nextInt();
        System.out.println("enter coloum size : ");
        int m = scanner.nextInt();
        Integer[][] matrix1 = new Integer[n][m];
        Integer[][] matrix2 = new Integer[n][m];
        getMatrix(matrix1, n, m);
        getMatrix(matrix2, n, m);

        SingleMatrix m1 = new SingleMatrix(matrix1);

        System.out.println("Sum of Matrixs : \n");

        Object[][] sum = m1.addMatrix(matrix2);
        printMatrix(sum);
        System.out.println("\n Multiplication of matrixs :\n");

        Object[][] multi = m1.multiplymatrix(matrix2);
        printMatrix(multi);
        scanner.close();
    }

    public static void printMatrix(Object matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println("");
        }
    }

    public static Integer[][] getMatrix(Integer[][] matrix, int n, int m) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter metix :");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        // scanner.close();
        return matrix;

    }

}
