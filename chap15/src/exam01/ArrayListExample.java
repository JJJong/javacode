package exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
		public static void main(String[] args) {
			List<String> list = new ArrayList<>();
			list.add("java");
			list.add("jtbc");
			list.add("database");
			
			System.out.println(list.size());
			
			System.out.println(list.get(1));
			
			list.add(1, "study");
			
			System.out.println(list.get(0));
			
			for(int i=0;1<list.size();i++) {
				System.out.println(list.get(i));
			}
			System.out.println();
			list.remove(0);
			
			for(int i=0;1<list.size();i++) {
				System.out.println(list.get(i));
			}
			
			System.out.println();
			list.remove("jdbc");
			for(int i=0;1<list.size();i++) {
				System.out.println(list.get(i));
			}
		}

}
