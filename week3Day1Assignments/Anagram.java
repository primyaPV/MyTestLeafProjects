package week3Day1Assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String args[]) {
		String text1="stops";
		String text2="potss";
		
		if (text1.length() != text2.length()) {
            System.out.println("Lengths mismatch, therefore the strings are not an Anagram.");
            }
		char[] arrText1=text1.toCharArray();
		char[] arrText2=text2.toCharArray();
		
		
		Arrays.sort(arrText1);
        Arrays.sort(arrText2);
        
        
        if (Arrays.equals(arrText1,arrText2)) {
            System.out.println("The given strings are Anagram.");
        } else {
        	
            System.out.println("The given strings are not an Anagram.");
        }
	}
}
