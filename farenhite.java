
    import java.util.*;
    public class fahrehneit_to_celsius {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int min  = sc.nextInt();
		int max  = sc.nextInt();
		int step = sc.nextInt();

		for (int i=min; i<=max; i+=step)
		{
			int cel = (5*(i-32))/9;
			System.out.println(i+" "+cel);
		}

    }
}
