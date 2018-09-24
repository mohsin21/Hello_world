import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n,count = 0;
	    n = in.nextInt();
	    int temp = n;
	    while(temp != 0)
	    {
	        temp = temp/10;
	        count++;
	    }
	    System.out.println(count);
	}
}
