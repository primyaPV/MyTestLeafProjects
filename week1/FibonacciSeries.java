package week1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=8;
		int first=0, sec=1;
		int output;
		
		for(int i=1;i<range;i++) {
			System.out.println(first);
			
			output=first+sec;
			first=sec;
			sec=output;
		
		}
		
	}

}
