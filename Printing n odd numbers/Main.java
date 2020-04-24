import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      int i,j=1;
      for(i=1;i<=n;i++)
      {
        System.out.println(j);
        j=j+2;
      }
	}
}