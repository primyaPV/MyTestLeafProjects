package week3Day2Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> result= new ArrayList<String> ();
		for(int i=0;i<companies.length;i++) {
	    	result.add(companies[i]);
	    }
		
		Collections.sort(result);
		System.out.println(result);
		 System.out.println("=========ReverseCollection=========");
		for (int i = result.size() - 1; i >= 0; i--) {
            System.out.print(result.get(i));
            
            // Add a comma after each element except the last one
            if (i != 0) {
                System.out.print(", ");
            }
	}
	

	}
}
