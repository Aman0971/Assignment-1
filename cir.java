 import java.util.*;
class Prog_2 {
    static double area_circle(int r){
        double ar=0.0;
        ar=3.14*r*r;
        return ar;
    }
    static int area_rect(int a,int b){
        int ar=0;
        ar=a*b;
        return ar;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius");
        int r=sc.nextInt();
        System.out.println("Enter length and breadth");
        int a=sc.nextInt();
        int b=sc.nextInt();
//        Prog_2 ob=new Prog_2();


        System.out.println(area_circle(r));
        System.out.println(area_rect(a,b));
    }

} 

