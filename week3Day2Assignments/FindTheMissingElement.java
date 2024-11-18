package week3Day2Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindTheMissingElement {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
     int[] arr1= {1, 2, 3, 4, 10, 6, 8};
    List<Integer> result= new ArrayList<Integer> ();
    
    for(int i=0;i<arr1.length;i++) {
    	result.add(arr1[i]);
    }

Collections.sort(result);
System.out.println(result);

for (int i = 0; i < result.size() - 1; i++) {
 
    if (result.get(i) + 1 != result.get(i + 1)) {
        System.out.println("Missing number: " + (result.get(i) + 1));
    }
}
 
	}

}
