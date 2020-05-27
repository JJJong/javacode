package ex.operator;

import java.util.Scanner;

public class AppleBox {
       public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in); 
    	System.out.println("사과 갯수를 입력하세요.");
		int a = scan.nextInt();
		System.out.println("박스당 갯수를 입력하세요.");
		int b = scan.nextInt();
		int c = a/b;
		int d = a%b;
		
		System.out.println("사과의 총 갯수는 " + a);
		System.out.println(c+"박스");
		System.out.println(d+"개");
	}
}
