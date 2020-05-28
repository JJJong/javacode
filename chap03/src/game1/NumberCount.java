package game1;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;

public class NumberCount {
	public static void main(String[] args) {
		System.out.println("*****************************************");
		System.out.println("*************UP & DOWN GAME**************");
		System.out.println("*****************************************");
		Scanner sc = new Scanner(System.in);
		int num, play;
		String tmp;
		num = (int)(Math.random()*100);
		System.out.println(num);
		for(int i = 0; i < 10; i++) {
			System.out.print("숫자를 입력하세요");
			tmp = sc.next();
			System.out.println(tmp);
//			if(play > 100) {
//				System.out.print("범위 초과");
//			} else if(play > num) {
//				if((play-num) < 5) {
//					System.out.print("Down근접");
//				} else {
//					System.out.print("Down");
//				}
//			} else if(play < num) {
//				if((num-play) < 5) {
//					System.out.print("Up근접");
//				} else {
//					System.out.print("Up");
//				}
//			} else {
//				System.out.print(" 정답  : "+ num + "\n 횟수 : ");
//				System.out.println(i+1);
//				if(i<1) {
//					System.out.println("오늘 운이 좋으시군요!");
//				}
//				System.out.println("이름을 입력하세요 : ");
//				String name = sc.next();
//				try {
//					Date d = new Date();
//					String s = d.toString();
//					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//				    BufferedWriter output = new BufferedWriter(new FileWriter("C:/code/up&down.txt", true));
//				    PrintWriter pw = new PrintWriter(output, true);
//				    String str = sdf.format(d) + " 이름  : " + name + " 횟수 :" + i + "\n";
//				    System.out.println(str);
//				    pw.write(str);
//				    pw.flush();
//				    pw.close();
//						
//				} catch (Exception e) {
//			            e.getStackTrace();
//				}
//				break;
//			}
			System.out.print("  ");
			System.out.println(9-i + "번 남았습니다");
		}	
	}

}
