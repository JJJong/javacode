package Practice;

import java.util.Scanner;

public class Prac01 {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.예금   |  2.출금   |  3.잔고  |    4.종료");
			System.out.println("---------------------------------------------");
			System.out.println("선택");
			int n=0;
			n=scanner.nextInt();
			int money=0;
			int m=0;
			
			switch(n) {
			case 1 : 
				m=scanner.nextInt();
				money+=m;
				System.out.println(money + "예금 되었습니다.");
				break;
			case 2 :
				m=scanner.nextInt();
				money-=m;
				if(money<m) {
					
					
				}
				System.out.println(money + "출금 되었습니다.");
				
			case 3 :
			}
		}
	}

}
