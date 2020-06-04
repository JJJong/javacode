package exam01;

import java.util.List;
import java.util.Vector;

public class VectorExample {
		public static void main(String[] args) {
			List<String> list = new Vector<String>();
			list.add("java");
			list.add("jdbc");
			list.add("database");
			
			System.out.println(list.size());
			
			list.add(1,"study");
			
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
			
		}

}
