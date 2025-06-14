import java.util.*;
import java.io.*;

public class temp {
    private static final int MOD = 1000000007;

    public static int[][] matrixMultiply(int[][] a, int[][] b) {
        return new int[][] {
                {
                        (int)((1L * a[0][0] * b[0][0] + 1L * a[0][1] * b[1][0]) % MOD),
                        (int)((1L * a[0][0] * b[0][1] + 1L * a[0][1] * b[1][1]) % MOD)
                },
                {
                        (int)((1L * a[1][0] * b[0][0] + 1L * a[1][1] * b[1][0]) % MOD),
                        (int)((1L * a[1][0] * b[0][1] + 1L * a[1][1] * b[1][1]) % MOD)
                }
        };
    }

    public static int[][] matrixExponentiate(int[][] matrix, int n) {
        int[][] result = { { 1, 0 }, { 0, 1 } }; // Identity matrix
        while (n > 0) {
            if ((n & 1) == 1) {
                result = matrixMultiply(result, matrix);
            }
            matrix = matrixMultiply(matrix, matrix);
            n >>= 1;
        }
        return result;
    }

    public static int fibonacciNumber(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        int[][] baseMatrix = { { 1, 1 }, { 1, 0 } };
        int[][] resultMatrix = matrixExponentiate(baseMatrix, n - 1);
        return resultMatrix[0][0]; // F(n) is at the top-left of the matrix
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases
        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            System.out.println(fibonacciNumber(n));
        }
    }
}