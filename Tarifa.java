import java.util.Scanner;

public class Tarifa {

	public static void main(String[] args) {
		int p = 0;
		int m = 0;
		int i,sum,cm;
		sum = 0;
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		p = scan.nextInt();
		m = scan.nextInt();
		
		for(i=0;i<m;i++){
			cm = scan.nextInt();
			sum = sum + (p - cm);
		}
		
		System.out.println(p + sum);

	}

}
