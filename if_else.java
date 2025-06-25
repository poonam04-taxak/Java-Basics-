import java.util.*;
public class if_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        sc.close();

        if(marks>=90 && marks<=100){
            System.out.println("A");
        }
        else if(marks>=80 && marks<=89){
            System.out.println("B");
        }
        else if(marks>=70 && marks<=79){
            System.out.println("C");
        }
        else if(marks>=60 && marks<=69){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
    
}

/*import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        
        if(n%2!=0){
            System.out.println("Weird");
        }
        else {
            if(n>=2 && n<=5 ){
                System.out.println("Not Weird");
            }
            else if(n>=6 && n<=20){
                System.out.println("Weird");
            }
            else {
                System.out.println("Not Weird");
            }
    }
}
}

 */