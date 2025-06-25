import java.util.*;
public class SubStringCompare{
    public static String smallAndLarge(String s,int k){
        String small=s.substring(0,k);
        String large=s.substring(0,k);

        for(int i=1;i<=s.length()-k;i++){
            String sub=s.substring(i,i+k);//update string
            if(sub.compareTo(small)<0){
                small=sub;
            }
            if(sub.compareTo(large)>0){
                large=sub;
            }
        }
        return large + "\n" + small;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
        sc.close();
        
        System.out.println(smallAndLarge(s,k));
    }
}