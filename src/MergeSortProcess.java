import java.util.List;

public class MergeSortProcess {

	public List<Integer> merge(List<Integer> a, List<Integer> b) {
		for(int i=0,j=0; i<b.size();) {
			if((j>a.size()-1)&& (i<=b.size()-1)) {
				a.add(j,b.get(i));
				i++;
				j++;
				
			}else {
				if(b.get(i)>=a.get(j)) {
					j++;
				}
				else {
					a.add(j,b.get(i));
					i++;
				}
			}
				
			
		}
		return a;
	}

}
