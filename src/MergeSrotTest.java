import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeSrotTest {
	static MergeSortProcess mp = new MergeSortProcess();
	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
	}
	
	public static void test1() {
		Integer[] a= {2,3,6,7,9};
		Integer[] b= {1,4,8};
		Integer[] res= {1,2,3,4,6,7,8,9};
		List<Integer> A = new ArrayList<Integer>();
		List<Integer> B = new ArrayList<Integer>();
		/* Collectins.addAll() is faster than adding elements using foreach & add()
		 but Collections.addAll() doesn't work for incompatible types.
		 if int[] a={2,3,6,7,9};
		 List<Integer> A= new ArrayList<Integer>();
		 Collections.addAll(A,a);
		 (it doesn't works and gives compilation error that "Collections.addAll()not applicable 
		 for Collection.addAll(List<Integer>,int[]). Because int & Integer aren't same)
		 that's why I converted a[] to Integer's here like
		 Integer[] a={2,3,6,7,9};
		  */
		((ArrayList<Integer>) A).ensureCapacity(8);
		Collections.addAll(A, a);
		Collections.addAll(B, b);
		List<Integer> C=mp.merge(A,B);
		//System.out.println("after merge A "+ A);
		if(C.equals(Arrays.asList(res))) {
			System.out.println("A ="+Arrays.asList(a));
			System.out.println("B= "+ B);
			System.out.println("after merge res "+ A);
			System.out.println("Success1");
		}
		else {
			System.out.println("A ="+Arrays.asList(a));
			System.out.println("B= "+ B);
			System.out.println("after merge res "+ A);
			
			System.out.println("Failure1");
		}
	}
	public static void test2() {
		Integer[] a= {6,7,9};
		Integer[] b= {1,4};
		Integer[] res= {1,4,6,7,9};
		List<Integer> A = new ArrayList<Integer>();
		List<Integer> B = new ArrayList<Integer>();
		((ArrayList<Integer>) A).ensureCapacity(8);
		Collections.addAll(A, a);
		Collections.addAll(B, b);
		List<Integer> C=mp.merge(A,B);
		//System.out.println("after merge A "+ A);
		if(C.equals(Arrays.asList(res))) {
			System.out.println("A ="+Arrays.asList(a));
			System.out.println("B= "+ B);
			System.out.println("after merge res "+ A);
			
			System.out.println("Success2");
		}
		else {
			System.out.println("A ="+Arrays.asList(a));
			System.out.println("B= "+ B);
			System.out.println("after merge res "+ A);
			
			System.out.println("Failure2");
		}
	}
	public static void test3() {
		Integer[] a= {6,7,9};
		Integer[] b= {10,14};
		Integer[] res= {6,7,9,10,14};
		List<Integer> A = new ArrayList<Integer>();
		List<Integer> B = new ArrayList<Integer>();
		((ArrayList<Integer>) A).ensureCapacity(8);
		Collections.addAll(A, a);
		Collections.addAll(B, b);
		List<Integer> C=mp.merge(A,B);
		//System.out.println("after merge A "+ A);
		if(C.equals(Arrays.asList(res))) {
			System.out.println("A ="+Arrays.asList(a));
			System.out.println("B= "+ B);
			System.out.println("after merge res "+ A);
			
			System.out.println("Success3");
		}
		else {
			System.out.println("A ="+Arrays.asList(a));
			System.out.println("B= "+ B);
			System.out.println("after merge res "+ A);
			
			System.out.println("Failure4");
		}
	}
	public static void test4() {
		Integer[] a= {6,19};
		Integer[] b= {7,10,11,15};
		Integer[] res= {6,7,10,11,15,19};
		List<Integer> A = new ArrayList<Integer>();
		List<Integer> B = new ArrayList<Integer>();
		((ArrayList<Integer>) A).ensureCapacity(8);
		Collections.addAll(A, a);
		Collections.addAll(B, b);
		List<Integer> C=mp.merge(A,B);
		//System.out.println("after merge A "+ A);
		if(C.equals(Arrays.asList(res))) {
			System.out.println("A ="+Arrays.asList(a));
			System.out.println("B= "+ B);
			System.out.println("after merge res "+ A);
			
			System.out.println("Success4");
		}
		else {
			System.out.println("A ="+Arrays.asList(a));
			System.out.println("B= "+ B);
			System.out.println("after merge res "+ A);
			
			System.out.println("Failure4");
		}
	}

}
