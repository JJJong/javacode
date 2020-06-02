package exam03;

public class Anonymous {
	Person field = new Person() {
		@Override
		void wake() {
			// TODO Auto-generated method stub
			super.wake();
			work();
		}

		void work() {
			System.out.println("출근합니다.");
		}
	};
	void method() {
		Person localVar = new Person() {
			
			@Override
			void wake() {
				// TODO Auto-generated method stub
				super.wake();
				walk();
			}

			void walk() {
				System.out.println("산책합니다.");
			}
		};
		
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}

}
