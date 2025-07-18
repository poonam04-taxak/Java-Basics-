import java.util.*;

public class PhoneBook{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine(); // consume leftover newline

        // Use HashMap to store phonebook
        HashMap<String, Integer> phonebook = new HashMap<>();

        for(int i = 0; i < n; i++)
        {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine(); // consume leftover newline
            phonebook.put(name, phone);
        }

        while(in.hasNext())
        {
            String s = in.nextLine();
        in.close();
            if(phonebook.containsKey(s)) {
                System.out.println(s + "=" + phonebook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
