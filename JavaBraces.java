import java.util.*;
public class JavaBraces{
    public static boolean isBalanced(String str){
        Stack<Character> stack=new Stack<>();

        for(char ch:str.toCharArray()){
            //push all opening braces
            if(ch=='(' || ch=='{' || ch==']'){
                stack.push(ch);
            }
            //handle closing braces
            else if(ch==')' || ch=='}' || ch==']'){
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();

                if((ch==')' && top!='(')||
                (ch=='}'&& top!='{')||
                (ch==']'&& top!='[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        sc.close();

        if(isBalanced(input)){
System.out.println("balanced");
        }
        else{
            System.out.println("not balanced");
        }
    }
}