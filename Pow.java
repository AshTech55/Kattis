import java.util.Scanner;


public class Pow {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		while(n>0){
			
			int a = scan.nextInt();
			int fp = a/10;
			int lp = a%10;
			sum = (int) (sum + Math.pow(fp,lp));
			n--;
		}
		System.out.println(sum);
		}
		
	}


