package examIfTest;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = (int)(Math.random()*100);
		System.out.println(num);
		int a=0;
		int b=0;
		for(int i=0;i<=9;i++) {
			System.out.println("숫자를 입력하세요.");
			int player = scan.nextInt();
			if(player==num) {
				System.out.println(num  );
				System.out.println("정답입니다.");
				System.out.println( ++i + "번 만에 맞추셨습니다.");
				break;
			}
			else if(player<num) {
				System.out.println("UP");
				System.out.println(9-i + "번의 기회가 남았습니다.");
			}
			else if(player>num) {
				System.out.println("Down");
				System.out.println(9-i + "번의 기회가 남았습니다.");
			
			}
				
		}
		int x =1;
		int y=3;
		int sum=x+(y++);
		System.out.println(sum);
		System.out.println(y);
		
	}
}
