import java.util.Scanner;
public class Conv_lowercase {
    public static void main(String[] args) {
        System.out.println("Enter a name ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        //String a = "Aman";
        name  = name.toLowerCase();
        System.out.println(name);

        // String hell = "my son welcome to hell ";
        // hell = hell.replace(" ", "_");
        // System.out.println(hell);

        // String letter = "Dear Aman,\n\t How are you?";
        // System.out.println(letter);

    }
}
