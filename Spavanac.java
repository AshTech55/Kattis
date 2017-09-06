import java.util.Scanner;

public class Spavanac {

	public static void main(String[] args) {
		int H,M;
		Scanner scan = new Scanner(System.in);
			H = scan.nextInt();
			M = scan.nextInt();
			int T = H*60 + M;
			T = T - 45;
			System.out.println(T/60 + " " + T%60);
	}
}
