import java.util.*;
public class Main
{    
 public static void main(String args[])
 { 
   Scanner in=new Scanner(System.in);   
   int n=in.nextInt();
   int m=in.nextInt();
   for(int i=n;i<m;i++)
   {
     if((i+1)%2==0)
     {
       System.out.println();
     }
     else
     {
       System.out.println(i+1);
     }
   }
  }
}
