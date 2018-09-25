import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n,temp,sum = 0,dig;
	    n = in.nextInt();
	    temp = n;
	    while(n!=0)
	    {
	        dig = n%10;
	        sum = (sum*10)+dig;
	        n = n/10;
	    }
	    if(temp == sum)
	      System.out.println("yes");  
	    else
	    System.out.println("no");
		
	}
}
