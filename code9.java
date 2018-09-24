import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n,k,sum = 0;
	    int num[] = new int[10];
		n = in.nextInt();
		k = in.nextInt();
		for(int i=0;i<n;i++)
		{
		    num[i] = in.nextInt();
		}
		for(int j=0;j<k;j++)
		{
		    sum = sum + num[j];
		}
		System.out.println(sum);
	}
}
