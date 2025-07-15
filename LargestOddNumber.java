//brute force
public class LargestOddNumber {
    public static String largest(String s){
        String maxOdd="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch-'0')%2==1){
              maxOdd=s.substring(0,i+1);
            }


        }
        return maxOdd;
    }
    public static void main(String[] args) {
        String s="235760";
        System.out.println(largest(s));
    }
}
/*public class LargestOddNumberInString {
    public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            if ((c - '0') % 2 == 1) { // check if odd
                return num.substring(0, i + 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String num = "239540";
        System.out.println(largestOddNumber(num));  // Output: "2395"
    }
}
 */