import java.io.*;
import java.util.*;

public class Prog9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many numbers do you want to count? ");
		int num = scan.nextInt();
		System.out.println();
		
		for(int i = 0; i < num; i++) {
			
			System.out.print((i + 1) + " ");
		}
	}

}
