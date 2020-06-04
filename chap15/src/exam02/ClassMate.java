package exam02;

public class ClassMate implements Comparable<ClassMate> {
		int stunum;
		String name;
		public ClassMate(int stunum, String name) {
			super();
			this.stunum = stunum;
			this.name = name;
		}
		@Override
		public int compareTo(ClassMate o) {
			// TODO Auto-generated method stub
			return stunum - o.stunum;
		}
		@Override
		public String toString() {
			return "Classmate [stunum=" + stunum + ", name=" + name + "]";
		}
		
		public static Comparator<ClassMate> comparator_name =
				new Comparator<ClassMate>() {
			
		}

}
