import java.util.Scanner;
public class student {
    String name,email_id,section ;
    int contact_no ;
      

    void get(){
      Scanner sc =  new Scanner(System.in);
      System.out.println("enter your name ");
      String name   = sc.next();
      System.out.println("enter your contact_no");
      long contact_no = sc.nextLong();
      System.out.println("enter your email_id ");
      String email_id = sc.next();
      System.out.println("enter your section ");
      String section = sc.next();

    }
     void display(){
      System.out.println(name);
      System.out.println(contact_no);
      System.out.println(email_id);
      System.out.println(section);
    }

    public static void main(String arg[]){
        student bc = new student();
        bc.get();
        bc.display();
    //  Scanner sc =  new Scanner(System.in);
    //   System.out.println("enter your name ");
    //   String name   = sc.next();
    //   System.out.println("enter your contact_no");
    //    int contact_no = sc.nextInt();
    //   System.out.println("enter your email_id ");
    //   String email_id = sc.next();
    //   System.out.println("enter your section ");
    //   String section = sc.next();
        //bc.display();
        
        
    }
    }

//}
        //System.out.println("enter the number");
    //    Scanner sc = new Scanner(System.in);
    //     System.out.println("enter the name ");
    //     String name = sc.next();
    //     System.out.println("enter the mobile number");
    //     Long num = sc.nextLong();
    //     System.out.println("enter  your email id");        
    //     String id  =sc.next();
    //     System.out.println("address");
    //     String address = sc.next();
    //     System.out.println("section of the student");
    //     String sec = sc.next();

    // }
    
  //