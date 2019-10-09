package day09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<Integer> list = new ArrayList<Integer>();
		
		list.add((Integer)scan.nextInt());
		list.add((Integer)scan.nextInt());
		list.add((Integer)scan.nextInt());
		list.sort(null);
		
		System.out.println(list.get(1));
		
		scan.close();
	}
}
