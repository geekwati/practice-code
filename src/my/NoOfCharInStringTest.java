package my;

public class NoOfCharInStringTest {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
		test5();
		
	}
	public static void test1() {
		if(!(NoOfCharInStringCount.count("Hello",'l')==2))
			System.out.println("Fails to count no. of 'l' in \"Hello\" is 2");
		
	}
	public static void test2() {
		if(!(NoOfCharInStringCount.count("",'l')==0))
			System.out.println("Fails to count no. of 'l' in \"\" is 0");
		
	}
	public static void test3() {
		if(!(NoOfCharInStringCount.count("test",'l')==0))
			System.out.println("Fails to count no. of 'l' in \"test\" is 0");
	
	}
	public static void test4() {
		if(!(NoOfCharInStringCount.count("Hello",'\0')==1))
			System.out.println("Fails to count no. of '\0' in \"Hello\" is 1");
		
	}
	public static void test5() {
		if(!(NoOfCharInStringCount.count("I love India",' ')==2))
			System.out.println("Fails to count no. of '\b' in \"I love India\" is 2");
		
	}
}
