package exam.ch05;

import java.util.Scanner;

public class StudentsScores {

	public static void main(String[] args) {
		int info[][]=new int[10][3];
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("---------------------------------------------------------------");
			System.out.println("1.성적입력  2.성적확인  3.각 성적 평균및 총점  4.종료");
			System.out.println("---------------------------------------------------------------");
			System.out.println("선택");
			int n=0;
			n=scan.nextInt();
			switch(n) {

			case 1:{
				int m=0;
				System.out.println("학생의 번호를 입력");
				m=scan.nextInt();
				
					System.out.println(m + "번 학생의 국어 점수를 입력하시오");
					info[m][0]=scan.nextInt();
					System.out.println(m + "번 학생의 수학 점수를 입력하시오");
					info[m][1]=scan.nextInt();
					System.out.println(m + "번 학생의 영어 점수를 입력하시오");
					info[m][2]=scan.nextInt();
				
					break;
			}
			case 2:{
				int m=0;
				System.out.println("학생의 번호를 입력");

				m=scan.nextInt();

				System.out.println( m +"번 학생의 국어 점수 : " + info[m][0]);
				System.out.println( m +"번 학생의 수학 점수 : " + info[m][1]);
				System.out.println( m +"번 학생의 영어 점수 : " + info[m][2]);
				break;
			}
			case 3:{
				int Asum=0;
				int Bsum=0;
				int Csum=0;
				int Aaver=0;
				int Baver=0;
				int Caver=0;
				for(int i=0;i<=2;i++) {
					Asum += info[i][0];
				}
				System.out.println(Asum);
			}

			}
			}
		}
	}


