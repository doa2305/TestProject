import java.util.Scanner;

public class Test5 {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Matrisin sat�r say�s�n� giriniz");
			int sat�r =sc.nextInt();
			System.out.println("Matrisin s�tun say�s�n� giriniz.");
			int s�tun =sc.nextInt();
			int [] [] matriseleman = new int[sat�r] [s�tun];
			
			for(int i=1; i<sat�r; i++) {
				for(int j=1; j<s�tun;j++) {
					matriseleman[i][j]=sc.nextInt();
					System.out.println ((i)+", "+(j)+"eleman: "+ matriseleman[i][j]);
				}
			}
			for (int m=0; m<sat�r; m++) {
				int sat�r_toplam= 0;
				for (int n=0; n<s�tun; n++) {
					sat�r_toplam += matriseleman[m][n];
					System.out.println ((m+1)+" sat�r toplam�"+sat�r_toplam);
				}
					
			}
	}
}