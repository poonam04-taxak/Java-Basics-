public class Constructor {
    String name;
    int roll;

    Constructor(String n,int r){
        this.name=n;
        this.roll=r;

    }

    public void display(){
        System.out.println("name " + name +" and your rollno is: "+roll);
    }
     public static void main(String[] args) {
        Constructor c=new Constructor("Poonam",1);
        c.display();

     }
    
}
