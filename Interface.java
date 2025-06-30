interface vehicle{
    void start();

}
class car implements vehicle{
    @Override
    public void start(){
        System.out.println("car is starting");
    }
}
public class Interface {
    public static void main(String[] args) {
        car c=new car();
        c.start();
    }
    
}
