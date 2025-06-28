import java.util.*;
public class StdinAndStdout {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double d=sc.nextDouble();
        sc.nextLine();//to clear the buffer
        String s=sc.nextLine();

        //reverse
        System.out.println("String " + s);
        System.out.println("double " + d);
        System.out.println("Integer " + n);
        sc.close();
    }
}
