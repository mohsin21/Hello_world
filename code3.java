import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		//char ch;
		
	    char ch = in.next().charAt(0);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
		    System.out.println("Vowel");
		}
		
		else
		System.out.println("Consonant");
	}
}