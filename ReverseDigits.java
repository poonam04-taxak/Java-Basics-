import java.util.*;
public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();

        int rev=0;
        while(num>0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        System.out.println(rev);
    }
    
}

/* Step 1: int digit = num % 10;
% 10 ka matlab: last digit nikalna

Example: 1234 % 10 = 4

➡️ digit = 4

🔹 Step 2: reverse = reverse * 10 + digit;
reverse ka initial value 0 hai

Ye line kya karegi?

pehle reverse = 0 * 10 + 4 = 4

agle step me: reverse = 4 * 10 + 3 = 43

fir: 43 * 10 + 2 = 432

fir: 432 * 10 + 1 = 4321

👉 Iska matlab: reverse number build ho raha hai step by step.

🔹 Step 3: num = num / 10;
/ 10 ka matlab: last digit hata do

Example: 1234 / 10 = 123
123 / 10 = 12
12 / 10 = 1
1 / 10 = 0 → loop end */