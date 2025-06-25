public class precedence {
    public static void main(String[] args) {
        //precedence & associativity
    //    int a=6*5-34/2;
        /*
        Highest precedence goes to * and /.They are then evaluated on the
        basis of left to right associativity
            =30-34/2
            =30-17
            =13
         */
  //      int b = 60/5-34*2;
        /*
        * has more precedence then / but according to associativity we goes from left 
        to right so we first divide it then multiply it
        =12-34*2
        =12-68
        =-56 

        * /=left to right
        + - =l to r
        ++,= ->r to l

         */
 //       System.out.println(a);
   //     System.out.println(b);
    //}
    
//}
/*Associativity tells the direction of execution of operator
it can either be left to right or right to left

multiply,division,modulus(left to right) =12 has more precedence than addition,substraction(left to right)=11

than left shift,right shift(left to right)=10

next less than <,<=,>,>= (left to right)than==,!=,&(left to right)=8

logical not,one's complement,unary minus(-),incr,decr,address-of(&),indirection,cast sizeof all
has more priority than others(right to left)=13

function call,array subscript,dot,arrow(left to right)(highest 14) have highest precedence*/


//quick quiz
//int x =6;
//int y =1;
int b=1;
int c=4;
int a=5;
//int k= x* y/2;//first multiply than divide 
int k=b*b - (4*a*c)/(2*a);//prantheses has more precedence than first evaluate 4*a*c than 2*a than b*b than subtract
System.out.println(k);
    }
}   