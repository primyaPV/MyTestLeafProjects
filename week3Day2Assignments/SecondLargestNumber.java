package week3Day2Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {3, 2, 11, 4, 6, 7} ;
		List<Integer> result= new ArrayList<Integer> ()  ;
		for(int i=0;i<arr1.length;i++) {
			result.add(arr1[i]);
		}
		 Collections.sort(result);
		 System.out.println(result);
		 
		 int secLastNum=result.get(result.size()-2);
		System.out.println("Second Largest Number "+secLastNum);
	}

}
