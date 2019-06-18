import java.util.Scanner;

public class Test5 {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Matrisin satýr sayýsýný giriniz");
			int satýr =sc.nextInt();
			System.out.println("Matrisin sütun sayýsýný giriniz.");
			int sütun =sc.nextInt();
			int [] [] matriseleman = new int[satýr] [sütun];
			
			for(int i=1; i<satýr; i++) {
				for(int j=1; j<sütun;j++) {
					matriseleman[i][j]=sc.nextInt();
					System.out.println ((i)+", "+(j)+"eleman: "+ matriseleman[i][j]);
				}
			}
			for (int m=0; m<satýr; m++) {
				int satýr_toplam= 0;
				for (int n=0; n<sütun; n++) {
					satýr_toplam += matriseleman[m][n];
					System.out.println ((m+1)+" satýr toplamý"+satýr_toplam);
				}
					
			}
	}
}