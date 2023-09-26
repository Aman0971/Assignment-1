import java.io.*;
import java.util.*;

public class palidrom {
               //Reverse the string and check it is same as privious or not 
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1="";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            s1= ch+s1;
        }
        if(s.equals(s1))
        {
            System.out.println("true");
        }
        else{
            System.out.println("no");
        }
    }
}
