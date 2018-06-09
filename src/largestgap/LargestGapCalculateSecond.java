package largestgap;

import java.util.ArrayList;

public class LargestGapCalculateSecond implements LargestGap {

	public Integer largestGapCalc(ArrayList<Integer> ary) {
		Integer max=Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		
		int count=0;
		for(int i=0; i<ary.size(); i++) {
			if(ary.get(i)>max)
				max=ary.get(i);
			if(ary.get(i)<min)
				min= ary.get(i);
			count++;
		}
		System.out.println("loop count= "+count);	
		return max-min;
	}
}
