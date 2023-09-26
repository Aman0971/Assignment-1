import java.util.*;
public class primenumber {
   public static void main(String arg[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number ");
      int num = sc.nextInt();
      int count = 0; 
      for( int i=1; i<=num; i++)
      {
         if( num%i == 0){
            count++;
         }
      }
      if(count==2)
      {
         System.out.println("Number is prime");
      }
      else{
         System.out.println("number is not prime ");
      }
   }
}
