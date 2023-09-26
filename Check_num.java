import java.util.Scanner;
public class Check_num {
    public static void main(String arg[]){
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if(a>b)
        // {
        //     System.out.println("number is greater:" +a );
        // }
        // else if(b==a){
        //     System.out.println( "both are equal");
        // }
        // else{
        //     System.out.println( "the greater number is" +b);
        // }
     //question 2 
     int a = sc.nextInt();
    System.out.println("enter a second number :");
     int b = sc.nextInt();
     System.out.println("enter a third number :");
     int c = sc.nextInt();
     if(a>b && a>c){
        System.out.println("Greater number is :"+a);
     }
     else if(b>a && b>c){
        System.out.println("Greater numbeer is:"+b);
     }
     else if(c>a && c>b){
        System.out.println("Greater number is :"+c);
     }
     else{
        System.out.println("all number are equal");
     }
    
}
}