package exam.ch05;

import java.util.Scanner;

public class StudentScore {
	public static void main(String[] args) {
		//10명의 학생 점수를 입력 받을 배열선언
		int score[] = new int[10];
		//scanner를 이용하여 배열에 입력받은 점수를 저장
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0 ; i<score.length ; i++) {
			System.out.println(i+1 + "번째 학생 점수");
			score[i] = scan.nextInt();
		}
		//반복문을 이용하여 배열의 점수의 합을 구한다.
		int sum=0;
	    for(int i=0 ; i<score.length ; i++) {
	    	sum=sum+score[i];
//	    	System.out.println("점수의 합은" + sum);
	    }
	    System.out.println("점수의 합은" + sum);
		//구한 합에 학생수로 나누어 평균을 구한다.
	    double averg= (double)sum/score.length;
	    System.out.println(averg);
	    System.out.println(score[9]);
	    
	 
				
//		Scanner scanner = new Scanner(System.in);
//		String names[] = 
//				scanner.nextLine();
	}

}
