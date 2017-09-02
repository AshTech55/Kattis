import java.util.Scanner;

public class Bijele {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a[] = {1,1,2,2,2,8};
		int b[] = new int[6];
		int i;
		for(i=0;i<6;i++){
			b[i]=scan.nextInt();
		}
		for (i=0;i<6;i++){
			System.out.print(a[i]-b[i]);
		}
		}
		
	}


