package week1;

public class CheckNumberIsPositive {
	
	
	int version=10;
	
	public void checkNumber() {
		if(version < 0) {
			System.out.println(version +" is negative number");
		}else {
			System.out.println(version +" is positive number");
		}
	}
	
	
	
	public static void main(String[] args) {
		//instance of class
		CheckNumberIsPositive checkNum=new CheckNumberIsPositive();
		
		checkNum.checkNumber();
		
		
	}

}
