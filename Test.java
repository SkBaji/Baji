import java.util.*;
class  Test
{
	
	int a,b;
	   void method1(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first positive Two digit number");
	      a=sc.nextInt();
		 System.out.println("Enter second positive Two digit number");
		   b=sc.nextInt();
		   a=a%10;
		   b=b%10;
		if(a==b)
				  System.out.println("true");
			
		else
			     System.out.println("true");
		}
		public static void main(String args[]){
			Test t=new Test();
	        t.method1();
	}
}
