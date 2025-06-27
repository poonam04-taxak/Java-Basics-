
import java.util.Scanner;

public class MaxConOnes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // ✅ Scanner declared correctly
        int n = sc.nextInt();
        sc.close();

        String binary = Integer.toBinaryString(n);

        int max = 0, currCount = 0;

        for (char c : binary.toCharArray()) {
            if (c == '1') {
                currCount++;
                if (currCount > max) {
                    max = currCount;
                }
            } else {
                currCount = 0;
            }
        }
        System.out.println(max);
    }
}
