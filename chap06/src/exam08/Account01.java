package exam08;

import java.util.Scanner;

public class Account01 {
	static int tmp = 0;
	private static Account01[] accountArray = new Account01[100];
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {	
		int selectNo = 0;
		
		Outer : while(true) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌 생성 | 2.계좌 목록 | 3.예금 | 4.출금 | 5.기록 | 6.종료");
			System.out.println("-----------------------------------------");
			selectNo = sc.nextInt();
			switch(selectNo) {
			case 1: 
				createAccount();
				break;
			case 2:	
				accountList();
				break;
			case 3:	
				deposit();
				break;
			case 4:	
				withdraw();
				break;
			case 5:
				log();
				break;
			case 6:
				break Outer;
			}
		}
	}

	private static void createAccount() {
		String ano, owner;
		int balance;

		System.out.println("계좌 번호를 입력해주세요");
		ano = sc.next();
		System.out.println("계좌주를 입력해주세요");
		owner = sc.next();		
		System.out.println("계좌잔고를 입력해주세요");
		balance = sc.nextInt();

		accountArray[tmp] = new Account(ano, owner, balance);
		tmp++;
		System.out.println("생성 완료");
	}
	private static void accountList() {
		for(int i = 0; i < tmp; i++) {
			System.out.println("계좌번호 : " + accountArray[i].getAno());
			System.out.println("계좌주 : " + accountArray[i].getOwner());
			System.out.println("계좌잔고 : " + accountArray[i].getBalance());
			System.out.println("");
		}
	}
	private static void deposit() {
		String ano_tmp, ano_tmp2;
		int input, balance;
		
		System.out.print("계좌번호를 입력하세요. ");
		ano_tmp = sc.next();
		
		for(int i = 0; i < tmp; i++) {
			System.out.println(i);
			ano_tmp2 = accountArray[i].getAno();
			if(ano_tmp2.equals(ano_tmp)) {
				System.out.print("넣으실 금액을 입력하세요. ");
				input = sc.nextInt();
				accountArray[i].deposit(input);
				break;
			}
		}		
	}
	private static void withdraw() {
		String ano_tmp, ano_tmp2;
		int input;
		
		System.out.print("계좌번호를 입력하세요. ");
		ano_tmp = sc.next();

		for(int i = 0; i < tmp; i++) {
			ano_tmp2 = accountArray[i].getAno();
			if(ano_tmp2.equals(ano_tmp)) {
				System.out.print("출금할 금액을 입력하세요. ");
				input = sc.nextInt();
				accountArray[i].withdraw(input);
				break;
			}
		}		
	}
	private static void log() {
		String ano_tmp, ano_tmp2;
		int input;
		String[] logs = new String[10];
		
		System.out.print("계좌번호를 입력하세요. ");
		ano_tmp = sc.next();
		for(int i = 0; i < tmp; i++) {
			ano_tmp2 = accountArray[i].getAno();
			if(ano_tmp2.equals(ano_tmp)) {
				logs = accountArray[i].getLog();
				for(String log : logs) {
					System.out.println(log);
				}
				break;
			}
		}		
	}
}
