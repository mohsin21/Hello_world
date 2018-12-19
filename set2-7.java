import java.util.*;
public class Main {

    public static void main(String[] args) {
      Scanner in= new Scanner(System.in);

        int n =in.nextInt();
        int temp,t,sum=0;
        temp=n;

        while(temp!=0)
        {
          t=temp%10;
          sum+=(t*t*t);
          temp=temp/10;
        }
        if(sum==n)
        {
          System.out.println("yes");
        }
        else
        {
          System.out.println("no");
        }
    }
}
