import java.util.*;
public class StringCompare{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a= sc.nextLine();
        String b=sc.nextLine();
        sc.close();

        if(a.length()>b.length()){
            System.out.println(a);
        }
        else if(a.length()<b.length()){
            System.out.println(b);
        }
        else{
            System.out.println("both are equal");
        }
    }
}