//import java.util.Scanner;
public class TrailingZeroInFactorial{
	public static void main(String... args){
		test1();
		test2();
		test3();
		test4();
		test5();
		test6();
		test7();
		test8();
		
		/*Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println("trailing zeros in "+n+"! = "+trailingZeroInFactorial(n));*/
	}
	public static void test1(){
		System.out.println("trailing zeros in 4! should be 0 and calculate = "+trailingZeroInFactorial(4));
		assert trailingZeroInFactorial(4)==0 : "fail for 4!" ;
	}
	public static void test2(){
		System.out.println("trailing zeros in 5! should be 1 and calculate = "+trailingZeroInFactorial(5));
		assert trailingZeroInFactorial(5)==1 : "fail for 5!" ;
	}
	public static void test3(){
		System.out.println("trailing zeros in 10! should be 2 and calculate = "+trailingZeroInFactorial(10));
		assert trailingZeroInFactorial(10)==2 : "fail for 10!" ;
	}
	public static void test4(){
		System.out.println("trailing zeros in 26! should be 6 and calculate = "+trailingZeroInFactorial(26));
		assert trailingZeroInFactorial(26)==6 : "fail for 26!" ;
	}
	public static void test5(){
		System.out.println("trailing zeros in 100! should be 24 and calculate = "+trailingZeroInFactorial(100));
		assert trailingZeroInFactorial(100)== 24: "fail for 100!" ;
	}
	public static void test6(){
		System.out.println("trailing zeros in 125! should be 31 and calculate = "+trailingZeroInFactorial(125));
		assert trailingZeroInFactorial(125)==31 : "fail for 125!" ;
	}
	public static void test7(){
		System.out.println("trailing zeros in 1000! should be 249 and calculate = "+trailingZeroInFactorial(1000));
		assert trailingZeroInFactorial(1000)==249 : "fail for 1000!" ;
	}
	public static void test8(){
		System.out.println("trailing zeros in 1001! should be 249 and calculate = "+trailingZeroInFactorial(1001));
		assert trailingZeroInFactorial(1001)==249  : "fail for 1001!" ;
	}
	private static int trailingZeroInFactorial(int n){
		int count=0,i,divider=5;
		i=n/divider;
		while(i>0){
			count+=i;
			divider*=5;
			i=n/divider;
		}
		return count;
	}


}