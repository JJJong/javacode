package examIfTest;

import java.util.Scanner;

public class DowhileExample {
	public static void main(String[] args) {
		System.out.println("메세지를 입력");
		System.out.println("프로그램 종료는 q");
		
		Scanner sc=new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
			}while(!inputString.equals("q"));
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
