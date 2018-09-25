import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int base,exponent,prod=1;
	    base = in.nextInt();
	    exponent = in.nextInt();
	    while(exponent!=0)
	    {
	        prod = prod * base;
	        --exponent;
	    }
		System.out.println(prod);
	}
}
