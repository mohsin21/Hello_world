import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    char ch = in.next().charAt(0);
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
		{
		    System.out.println("Alphabet");
		}
		else
		System.out.println("???");
	}
}
