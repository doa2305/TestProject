import java.util.Scanner;

public class Test3 {

public static void main(String[] args) {
		
		
		
		int [] dizi = new int[]{2,4,6,8,10,12,14,16,18,20};
		
		System.out.println("l�tfen bir sayi giriniz");
		Scanner sc=new Scanner(System.in);
		int sayi=sc.nextInt();
		
		
		for(int i=0; i<dizi.length; i++) {
		 
		if(dizi[i]==sayi)
		 { 
			 System.out.println("sayi dizinin i�inde vard�r");
		 } 
			 else {
				 System.out.println("sayi dizinin i�inde yoktur");
			 }
		 }
	}
}

