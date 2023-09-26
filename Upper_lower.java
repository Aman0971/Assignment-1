import java.util.Scanner;
public class Upper_lower {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a character :");
        char a = sc.next().charAt(0);
        if(a>='a'&& a<='z'){
            System.out.println("Character is in Lowercase ");
        }
        else {
            System.out.println("Character is in Uppercase ");
        }
    }
    
}
