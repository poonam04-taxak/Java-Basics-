public class MethodOverloading {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }
    public static void main(String[] args) {
        MethodOverloading mo=new MethodOverloading();

        System.out.println("sum of two int value " +mo.add(5,10));
        System.out.println("sum of three int value: "+mo.add(1,2,3));
        System.out.println("sum of double values: "+mo.add(456.7,12.3));
    }
}
