import java.util.Scanner;

public class Program01 {

	public static void main(String[] args){
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. of rows");
		n = scan.nextInt();
		int space = n - 1;
	
		for (int i = 0; i < n; i++){
			for (int j = 0; j < space; j++)
				System.out.print(" ");

			for (int j = 0; j <= i; j++)
				System.out.print("* ");
	
			System.out.print("\n");
			space--;
		}

		space = 0;

		for (int i = n; i > 0; i--){

			for (int j = 0; j < space; j++)
				System.out.print(" ");
	
			for (int j = 0; j < i; j++)
				System.out.print("* ");
	
			System.out.print("\n");
			space++;
		}
		
	}
}
