import java.util.Scanner;
class Main
{
 public static void main(String args[])
 {
   Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   int l=n%10; 
   n=n/10;
   int f=0;
   int sum=l;
   while(n>0)
   {
      f=n%10;
     n=n/10;
  }
   sum=sum+f;
   System.out.println(sum);
 }
}