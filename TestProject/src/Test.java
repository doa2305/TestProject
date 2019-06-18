import java.util.Scanner;

public class Test {
	public static void main(String args[])
	 { 
	 
	 
	 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the number of rows");
	     int i,j,rows=6;
	     rows = sc.nextInt();
	    
	 for(i=1;i<=rows;i++)
	     {
	         for(j=1;j<=i;j++)
	         {
	             System.out.print("* ");
	         }
	         System.out.println("");
	     } 
	 }
}
