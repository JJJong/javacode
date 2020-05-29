package exam.ch05;

import java.util.Scanner;

public class StudentsScores {

	public static void main(String[] args) {
		int info[][]=new int[5][3];
		Scanner scan = new Scanner(System.in);
	outter : while(true) {
			System.out.println("----------------------------------------------");
			System.out.println("1.성적입력  2.성적확인  3.각 성적 평균및 총점  4.종료 5.석차");
			System.out.println("----------------------------------------------");
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
			case 2:
				int m=0;
				System.out.println("학생의 번호를 입력");

				m=scan.nextInt();

				System.out.println( m +"번 학생의 국어 점수 : " + info[m][0]);
				System.out.println( m +"번 학생의 수학 점수 : " + info[m][1]);
				System.out.println( m +"번 학생의 영어 점수 : " + info[m][2]);
				break;
			
			case 3:
				int Asum=0;
				int Bsum=0;
				int Csum=0;
				int Aaver=0;
				int Baver=0;
				int Caver=0;
				for(int i=0;i<=2;i++) {
					Asum += info[i][0];
					Bsum += info[i][1];
					Csum += info[i][2];
				}
				System.out.println(Asum + "국어 총 점수");
				System.out.println(Bsum + "수학 총 점수");
				System.out.println(Csum + "영어 총 점수");
				Aaver = Asum / info.length;
				Baver = Bsum / info.length;
				Caver = Csum / info.length;
				System.out.println(Aaver + "국어 평균 점수");
				System.out.println(Baver + "수학 평균 점수");
				System.out.println(Caver + "영어 평균 점수");

				
				break;
			case 5 :
				int rank[]=new int[5];
				int Asum1=0;
				int Bsum1=0;
				int Csum1=0;
				int Aaver1=0;
				int Baver1=0;
				int Caver1=0;
				for(int i=0;i<=2;i++) {
					Asum1 += info[i][0];
					Bsum1 += info[i][1];
					Csum1 += info[i][2];
					Aaver1 = Asum1 / info.length;
					Baver1 = Bsum1 / info.length;
					Caver1 = Csum1 / info.length;
				}
				for(int i=0; i<5 ; i++) {
					rank[i]=1;
				}
					
					
				for(int i=0; i<5 ;i++) {
					double standard_student_score = info[i][0];
					
					for (int j = 1; j<5; j++) {
						
						double compare_student_score=info[j][0];

					if(standard_student_score < compare_student_score){
						rank[i]++;
					}
					else if(standard_student_score > compare_student_score){
						rank[j]++;		
					}
				}
				}
				System.out.println(rank[0]);
				System.out.println(rank[1]);
				System.out.println(rank[2]);
				System.out.println(rank[3]);
				System.out.println(rank[4]);
			    break;
			
			
			
			
			case 4 :
				break outter;
			

			}
			}
		}
	}


