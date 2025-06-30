
// Superclass
class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

// Subclass inheriting from Arithmetic
class Adder extends Arithmetic {
}

// Main class to test
public class Iheritance2 {
    public static void main(String[] args) {
        Adder adder = new Adder();

        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());

        System.out.print(adder.add(20, 22) + " ");
        System.out.print(adder.add(10, 3) + " ");
        System.out.print(adder.add(11, 9));
    }
}
