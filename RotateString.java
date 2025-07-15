
public class RotateString {

    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        String doubled = s + s;
        return doubled.contains(goal);
    }

    public static void main(String[] args) {
        String s1 = "abcde", goal1 = "cdeab";
        System.out.println(rotateString(s1, goal1)); // true

        String s2 = "abcde", goal2 = "abced";
        System.out.println(rotateString(s2, goal2)); // false

        String s3 = "aa", goal3 = "aa";
        System.out.println(rotateString(s3, goal3)); // true
    }
}
