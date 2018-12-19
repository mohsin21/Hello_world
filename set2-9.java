import java.util.*;
public class Main {

    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);

        int n= in.nextInt();
        int prod= 1;
        for(int i=1;i<=n;i++)
        {
prod=prod*i;
        }
        System.out.println(prod);
    }
}
