import java.util.*;
public class InputOutput_StringSplit {
   public static void main(String[] args) {
    
   
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    sc.close();

    String[] tokens=s.trim().split("[^A-Za-z]+");

    System.out.println(tokens.length);
    for(String token:tokens){
        System.out.println(token);
    }
}
}

/*s.trim() kya karta hai?
Ye string ke starting aur ending ke spaces hata deta hai.

Example:
java
Copy code
String s = "  Hello World  ";
System.out.println(s.trim());  // Output: "Hello World"

 2. split("[^A-Za-z]+") kya karta hai?
Yeh part thoda important hai. Iska matlab:

[^A-Za-z] → match everything that is NOT a letter

A-Z → capital letters

a-z → small letters

^ → not (negation)

+ → means one or more times

So:

java
Copy code
.split("[^A-Za-z]+")
matlab non-alphabet characters (like spaces, punctuation, numbers, etc.) se string ko tod do (split karo)

✅ Example:
java
Copy code
String s = "He is@a#good123boy!";
String[] tokens = s.trim().split("[^A-Za-z]+");
Output:
csharp
Copy code
He
is
a
good
boy
@, #, 123, ! sab remove ho jaate hain because they are not A–Z or a–z.

*/