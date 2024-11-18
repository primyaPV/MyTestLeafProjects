package week3Day1Assignments;

public class ReverseOddWordsInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String test = "I am a software tester";

        String[] words = test.split(" ");

        String result = "";

        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 1) {
              
                String reversedWord = reverseWord(words[i]);
                result += reversedWord; 
            } else {
               
                result += words[i];
            }
            if (i < words.length - 1) {
                result += " ";
            }
        }

   
        System.out.println(result);
    }

   
    private static String reverseWord(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);  
        }
        return reversed;
    }
		
	}


