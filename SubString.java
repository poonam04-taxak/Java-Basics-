import java.util.*;
public class SubString{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int start=sc.nextInt();
        int end=sc.nextInt();
        sc.close();

        System.out.println(s.substring(start,end+1));
    }
}