package ex.operator;

import java.util.Scanner;

public class Exercise05 {
 public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 int a = scan.nextInt();
	 System.out.println(a);
	 int value = a%100;
	 int result = a-value;
	 System.out.println(result);
			
 }
}
