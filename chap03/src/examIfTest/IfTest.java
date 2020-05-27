package examIfTest;

import java.util.Scanner;

public class IfTest {
       public static void main(String[] args) {
    	   Scanner scan = new Scanner(System.in);
    	   int a = 0;
    	   int b = 0;
    	   for(int i=0;i<=4;i++) { System.out.println("원하는 숫자를 입력");
    	   int you = scan.nextInt();
    	   int com = (int)(Math.random()*6)+1;
    		   if(you>=1 && you <=6) {
    			   if(com==you) {
    				   a++;
    				   System.out.println("맞췄"); }
    			   else {
    				   b++;
    				   System.out.println("틀렸");
    			   }	    		 
    		   } else {
    			   System.out.println("숫자범위를 벗어났습니다.");
    		   }
    	   }
    	  System.out.println(a + "번 맞췄");
    	  System.out.println(b + "번 틀렸");
    	  
    	   
       }
}
