package week3Day1Assignments;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "changeme";
		char[] charArray = text.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			if (i % 2 != 0) {
               
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
			
		}
		
		String result=new String(charArray);
		
		System.out.println(result);
	}

}
