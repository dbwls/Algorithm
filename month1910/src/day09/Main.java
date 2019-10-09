package day09;

import java.util.Scanner;

public class Main {
	
	public void mul (int a, int b) {
		int result = a*b;
		while(b>0) {
			System.out.println(a*(b%10));
			b/=10;
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Main main = new Main();
		
		main.mul(scan.nextInt(), scan.nextInt());
		
		scan.close();
	}
}
