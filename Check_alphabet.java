import java.util.Scanner;
public class Check_alphabet {
    
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        System.out.println("Enetr a character:");
        char a = sc.next().charAt(0);
        if((a>='a'&&a<='z')||(a>='A'&& a<='Z')){
            System.out.println("Character is Alphabet");
        
        }
        else {
            System.out.println("Character is not Alphabet");
        }


    }
}
