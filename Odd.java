import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a,b,i;
			Scanner scan = new Scanner(System.in);
			a = scan.nextInt();
			for(i=0;i<a;i++){
			b = scan.nextInt();
			if (b%2 == 0){
				System.out.println(b + " is even");
			}
				else{
					System.out.println(b + " is odd");
				}
				
			}
			
				
			}
	}


