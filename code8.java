import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n,sum = 0;
	    
		n = in.nextInt();
		for(int i=1;i<=n;i++)
		{
		    sum+=i;
		}
		System.out.println(sum);
	}
}
