package week3Day2Assignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionusingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr1= {3, 2, 11, 4, 6, 7} ;
       int[] arr2= {1, 2, 8, 4, 9, 7};
       
       List <Integer> result = new ArrayList <Integer> ();
       
       for(int i=0;i<arr1.length;i++) {
    	   
    	   for(int j=0;j<arr2.length;j++) {
    		   
        	   if(arr1[i]==arr2[j]) {
        		   result.add(arr1[i]);
        	   }
           }
       }
       System.out.println(result);
	}

}
