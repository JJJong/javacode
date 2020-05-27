package ex.operator;

import java.util.Scanner;

public class ConditionalOperationExample {
       public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("총점을 입력하시오");
		int sum = scan.nextInt();
		String t = sum>=80 ? "합격" : "불합격";
		System.out.println(t);
		
	}
}
