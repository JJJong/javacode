package ex.operator;

public class OverflowExample {
      public static void main(String[] args) {
    	  int x=100000000;
    	  int y=100000000;
    	  int z = x * y;
    	  System.out.println(z);
    	  byte x1=127;
    	  byte y1=(byte) (x1+2);
    	  System.out.println(y1);
	
}
}
