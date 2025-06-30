abstract class shape{
    abstract void draw();

    void display(){
        System.out.println("displaying shape");
    }

}

class circle extends shape{
    @Override
    void draw(){
        System.out.println("drawing circle");
    }
}
public class Abstract {
public static void main(String[] args) {
    circle c=new circle();
    c.draw();
    c.display();
}    
}
