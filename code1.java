import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		int num;
		System.out.println("Input:");
		num = in.nextInt();
		if(num == 0)
		{
		    System.out.println("Output:Zero");
		}
		else if(num > 0)
		{
		    System.out.println("Output:Positive");
		}
		else
		System.out.println("Output:Negative");
	}
}
