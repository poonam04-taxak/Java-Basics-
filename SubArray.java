
import java.util.*;

public class SubArray{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();
        
        int count = 0;
        
        // Generate all subarrays
        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = i; j < n; j++) {
                sum += arr[j];
                if(sum < 0) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}
/*import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();

        long[] prefix = new long[n + 1];
        prefix[0] = 0;
        for(int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        long count = countInversions(prefix, 0, n);
        System.out.println(count);
    }

    private static long countInversions(long[] arr, int left, int right) {
        if (right - left <= 1) {
            return 0;
        }
        int mid = (left + right) / 2;
        long count = countInversions(arr, left, mid) + countInversions(arr, mid, right);

        int j = mid;
        for (int i = left; i < mid; i++) {
            while (j < right && arr[j] < arr[i]) {
                j++;
            }
            count += j - mid;
        }

        // Merge step
        long[] sorted = new long[right - left];
        int i = left, k = 0;
        j = mid;
        while (i < mid && j < right) {
            if (arr[i] <= arr[j]) {
                sorted[k++] = arr[i++];
            } else {
                sorted[k++] = arr[j++];
            }
        }
        while (i < mid) {
            sorted[k++] = arr[i++];
        }
        while (j < right) {
            sorted[k++] = arr[j++];
        }
        System.arraycopy(sorted, 0, arr, left, sorted.length);

        return count;
    }
}
 */