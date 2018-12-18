import java.util.*;
public class Main{    
 public static void main(String args[]){ 
   Scanner in=new Scanner(System.in);   
  int i,m=0,flag=0;      
  int n=in.nextInt();//it is the number to be checked    
  m=n/2;      
  if(n==0||n==1){  
   System.out.println("no");      
  }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     System.out.println("no");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { System.out.println("yes"); }  
  }//end of else  
}    
}
