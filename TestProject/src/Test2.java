import java.util.Scanner;

public class Test2 {

	        public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Bir sayi giriniz");
			int sayi=sc.nextInt();
			int sayac=0;
			for(int i=1;i<=sayi;i++) {
				
				if(sayi % i==0)
				
					sayac++;
				
	}
				
				if(sayac==2) {
		   System.out.println(sayi+ " asaldýr");
	   }   
		   else {
			   System.out.println(sayi+ " asal deðildir");
	   }
	}

}
