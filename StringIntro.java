import java.util.*;
public class StringIntro{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        sc.close();
 //print length of both strings
        System.out.println(s1.length()+s2.length());

        //compare
        if(s1.compareTo(s2)>0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

        //captitlze of first letter of both strings
        String caps1=s1.substring(0,1).toUpperCase()+s1.substring(1);
        String caps2=s2.substring(0,1).toUpperCase()+s2.substring(1);

        System.out.println(caps1 + " "+caps2);
    }
}