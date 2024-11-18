package week3Day1Assignments;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text ="We learn Java basics as part of java sessions in java week1"; 
		//Expected output: “We learn Java basics as part of    sessions in    week1” 
		
		String[] text1=text.split(" ");
		
		
		for(int i=0;i<text1.length;i++) {
			for(int j=i+1;j<text1.length;j++) {
				
				if(text1[i].equals(text1[j]))
				{
					String result = text1[i];
					System.out.println("output : "+result);
					text = text.replaceAll(result, " ");
					
				}
				
				
			}
			
		}
		
		System.out.println("output : "+text);
	}

}
