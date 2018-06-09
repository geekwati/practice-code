package largestgap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestGapTest {
		
	public static void main(String[] args) {
		LargestGapCalculateFirst largestGapCalcF = new LargestGapCalculateFirst();
		LargestGapCalculateSecond largestGapCalcS = new LargestGapCalculateSecond();
		test1(largestGapCalcF);
		test1(largestGapCalcS);
		test2(largestGapCalcF);
		test2(largestGapCalcS);

	}
	public static List<Integer> initialize(Integer [] a) {
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(Arrays.asList(a));
		return list;	
	}
	public static void check(Integer calcGap , Integer expectedGap, int testNo) {
		if(calcGap==expectedGap)
			System.out.println("Successful Test"+testNo);
		else
			System.out.println("Failure Test"+testNo);
		
	}
	
	public static void test1(LargestGap largestGapOb) {
		Integer []a= {3,1,4,6,7,2,5};
		ArrayList<Integer> ary = (ArrayList<Integer>)initialize(a);
		Integer calcLargestGap = largestGapOb.largestGapCalc(ary);
		check(calcLargestGap,6,1);
	}
	public static void test2(LargestGap largestGapOb) {
		Integer []a= {-3, -1, 6, 7, 0};
		ArrayList<Integer> ary = (ArrayList<Integer>)initialize(a);
		Integer calcLargestGap = largestGapOb.largestGapCalc(ary);
		check(calcLargestGap,10,2);
	}
}
