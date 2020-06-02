package exam05;

import java.util.Comparator;

public class StudentComparator1 implements Comparator<Student>{

	@Override
	public int compare(Student a, Student b) {
		if(a.sno<b.sno) {
			return -1;
		}
		else if(a.sno==b.sno)
			return 0;
		else return 1;
		return 0;
	}
			
}
