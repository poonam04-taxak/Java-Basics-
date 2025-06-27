
import java.util.Scanner;

public class HourGlassSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][6];

        // Reading input
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int maxSum = Integer.MIN_VALUE;

        // Calculate hourglass sums
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                                    + arr[i+1][j+1] +
                          arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        System.out.println(maxSum);
    }
}

