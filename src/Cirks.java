import java.util.Random;
import java.util.Scanner;

public class Cirks {
	static void mestKaulinu(int reizes){
		int skaitlis;
		Random rand = new Random();
		for(int i=0; i<reizes; i++){
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Uzkrita skaitlis: "+skaitlis);			
		}
}
	
	
	
	public static void main(String[] args) {
		int reizes;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("Cik reizes mest kauli�u?");
			reizes = scan.nextInt();
		}while(reizes<1);
		mestKaulinu(reizes);
		scan.close();
	}
}