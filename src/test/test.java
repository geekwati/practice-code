package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


public class test {
public static void main(String [] args) {
	System.out.println("Hello World!");
	Integer [] a= {1,2,3,4,5};
	Integer []b= {4,5,6,7,8};
	//int []union= {};
	//ArrayList<Integer> union =new ArrayList<Integer>();
	ArrayList<Integer> intersection =new ArrayList<Integer>();
	int loopCount=0;
	HashSet<Integer> unionSet= new HashSet<Integer>();
	unionSet.addAll(Arrays.asList(a));
	unionSet.addAll(Arrays.asList(b));
	for(int i=0;i<a.length;i++) {
		if(Arrays.asList(b).contains(a[i])){
			intersection.add(a[i]);
		}
	}
	
	printArray(unionSet);
	printArray(intersection);
		System.out.println("loopcount= "+loopCount);		
	
	
	}
public static void printArray(ArrayList<Integer> a) {
	System.out.println();
	System.out.println("array output");
	for(Integer ar:a) {
		System.out.print("  "+ar);
	}
}
public static void printArray(HashSet<Integer> a) {
	System.out.println();
	System.out.println("array output");
	for(Integer ar:a) {
		System.out.print("  "+ar);
	}
}
}
