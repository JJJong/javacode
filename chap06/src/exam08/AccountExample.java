package exam08;

	public class AccountExample {
		private String ano;
		private String owner;
		private int balance;
		private String[] log= new String[10];
		public String[] getLog() {
			return log;
		}
		private int tmp=0;
		
		public AccountExample(String ano, String owner, int balance) {
			this.ano = ano;
			this.owner = owner;
			this.balance = balance;
		}

		public String getAno() {return ano;}
		public void setAno(String ano) {this.ano = ano;}
		public String getOwner() {return owner;}
		public void setOwner(String owner) {this.owner = owner;}
		public int getBalance() {return balance;}
		
		public void deposit(int balance) {
			this.balance += balance;
			log[tmp] = "입금액 : "+ balance + " 현재 잔액 : " + this.balance;
			tmp++;
			System.out.println("입금 완료");
		}
		public void withdraw(int balance) {
			if(balance > this.balance) {
				System.out.println("잔액이 부족합니다.");
			} else {
				this.balance -= balance;
				log[tmp] = "출금액 : "+ balance + " 현재 잔액 : " + this.balance;
				tmp++;
				System.out.println("출금 완료");
			}
		}
		
	}
