package examIfTest;

import java.util.Scanner;

public class SwitchExample2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("성적을 입려하시오");
		int num = scan.nextInt();
		switch(num/10) {
		case 10 :
			System.out.println("A+");
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B+");
			break;
		default: // 그 외 나머지인 경우
			break;
			//System.out.println("");
		}  
	}

}
