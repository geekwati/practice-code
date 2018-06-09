package largestgap;

import java.util.ArrayList;

public class LargestGapCalculateFirst implements LargestGap {
	public Integer largestGapCalc(ArrayList<Integer> ary) {
		Integer diff=Integer.MIN_VALUE;
		int count=0;
		for(int i=0; i<ary.size(); i++) {
			for(int j=i+1; j<ary.size();j++) {
				Integer tDiff= Math.abs(ary.get(i)-ary.get(j));
				if(tDiff > diff)
					diff = tDiff;
				count++;
			}
			
		}
		System.out.println("loop count= "+count);	
		return diff;
	}
}
