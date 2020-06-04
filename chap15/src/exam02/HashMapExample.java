package exam02;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		Map<Student,Integer> map = new HashMap<>();			
		map.put(new Student(1 , "헝길떵") , 95);
		map.put(new Student(2 , "헝길떵") , 95);
		System.out.println(map.size());
	}

}
