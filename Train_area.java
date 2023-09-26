import java.util.Scanner;
public class Train_area {
    public static void main(String arg[]){
        System.out.println("Enter the base  of the triangle ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        System.out.println("Enter the height of the triangle");
        double b = sc.nextInt();
        double area = (.5 * (a) * (b)) ;
        System.out.println("area of triangle is :" +area);

    }
}
