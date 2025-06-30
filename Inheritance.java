
class animal{
    void sound(){
        System.out.println("animal barking");
    }
}

    class dog extends animal{
      @Override
        void sound(){
            System.out.println("dog is barking");
        }
    }

public class Inheritance {
    public static void main(String[] args) {
        animal i=new animal();
        i.sound();

        dog d=new dog();
        d.sound();
    }
    
}
