package exam05;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {
	public static void main(String[] args) {
		Student s1 = new Student(3);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		int result = Objects.compare(s2, s3, new StudentComparator());
		System.out.println(result);
	}
	static class Student{
		int sno;

		public Student(int sno) {
			super();
			this.sno = sno;
		}
		
	}
	static class StudentComparator implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return Integer.compare(o1.sno, o2.sno);
		}
		
	}

}
