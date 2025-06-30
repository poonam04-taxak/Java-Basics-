import java.util.*;
class Student{
    String name;
    int rollno;
    int marks;

   public Student(String n,int r,int m){
    this.name=n;
    this.rollno=r;
    this.marks=m;
   }
   //method to display student details
   public void display(){
   System.out.println("name :"+name+ ", rollno " + rollno + " , marks: "+marks);
   }

}
public class SortByMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of student :");
        int n=sc.nextInt();
        sc.nextLine();

        //array of student obj
        Student[] stu=new Student[n];
        //taking input for each student
        for(int i=0;i<n;i++){
            System.out.println("enter details for student "+(i+1)+ ":");

            System.out.println("name ");
            String name=sc.nextLine();

            System.out.println("rollno: ");
            int rollno=sc.nextInt();

            System.out.println("marks : ");
            int marks=sc.nextInt();
            sc.nextLine();

            stu[i]=new Student(name,rollno,marks);
        }
         //sorting stu in descending order of marks
         Arrays.sort(stu,new Comparator<Student>(){
            public int compare(Student s1,Student s2){
                return s2.marks-s1.marks;//descending
            }
         });
         //display sorted stu
         System.out.println("students sorted by marks: ");
         for(Student s:stu){
            s.display();
         }
         sc.close();


    }
    
}
