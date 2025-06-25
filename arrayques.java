import java.util.Scanner;
public  class arrayques {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr =new int[3];
System.out.println("enter three numbers:");
         //input using for loop
         for(int i=0;i<arr.length;i++)
         {
           arr[i]= sc.nextInt();//used to take input from user if not use we can give numbers
         }
         System.out.println("you entered:");
         for(int i=0;i<arr.length;i++)//used to print number again that we given 
         {
            System.out.println(arr[i]);
         }
         sc.close();
    }
    
}




/*array of object
String s = new String[2];
for(int i=0;i<s.length;i++){
s[i]=s.nextLine();
}
System.out.println(Array.toString(s)); convert an object into string representation




//modify the string
str[1]="poonam";
System.out.println(Array.toString(str));

 */
