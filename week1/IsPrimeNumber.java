package week1;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number=1;
boolean isPrime=true;

if(number <= 1) {
	isPrime=false;
}else {
	
	for(int i=2;i<number;i++) {
		if(number % i== 0) {
			isPrime=false;
		}
	}
}

if(isPrime ==  true) {
		System.out.println(number + " is prime number");
	}else {
		System.out.println(number + " is not prime number");
		}
	}

}
