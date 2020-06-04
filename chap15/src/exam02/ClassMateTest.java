package exam02;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ClassMateTest {
	public static void main(String[] args) {


		List<ClassMate> classs = new LinkedList<>();

		classs.add(new ClassMate(20170609, "정현진"));
		classs.add(new ClassMate(20090609, "김선홍"));
		classs.add(new ClassMate(20100609, "정종민"));
		
		Collections.sort(classs, Collections.reverseOrder());
		
		for(ClassMate m : classs) {
			System.out.println(m);
		}
		

	}
}