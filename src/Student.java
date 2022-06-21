public class Student {
    String name;
    int rollNo;

    //Constructor
    //Under the brackets value is called parameters
    public Student(int rollNo ,String name){
        this.name=name;
        this.rollNo=rollNo;
    }


    //Non parameter constructor are default constructor

    public Student(){

    }

    public static int sum(){
        int a=78;
        int b=1;
        int c = a+b;
        return c;
    }


    public static int sum(int x,int y){
        int c = x+y;
        return c;
    }

    //void = null
    public static void print(){
        int a=78;
        int b=78;
        int c =a+b;
        System.out.println("This is print void function");
        System.out.println(c);
    }

    public static void main(String[] args) {
//        Student sds = new Student(45,"Akash");
//////        sds.name="Akash";
////
////        System.out.println(sds.name);
////        System.out.println(sds.rollNo);
//            int ans = sum();
//
//            int a = sum2(45,45);
//
//
//        System.out.println(ans);
//        System.out.println(a);

        print();

    }
}
