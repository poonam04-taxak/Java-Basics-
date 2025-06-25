import java.util.*;
public class PrintEvenNoInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start =sc.nextInt();
        int end=sc.nextInt();
        sc.close();

        for(int i=start;i<=end;i++){
            if(i%2==0){
                System.out.println(i+ " ");
            }
        }
    }
}
