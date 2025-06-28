import java.util.*;
public class ImplicitTypeCasting{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double num=n;
        System.out.println("our int value is: "+n);
        System.out.println("our double value is after implicit conversion: "+num);
        sc.close();
    }
}