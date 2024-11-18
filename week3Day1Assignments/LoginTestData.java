package week3Day1Assignments;

public class LoginTestData extends TestData{
	
	public void enterUsername(String name) {
		System.out.println("User name : "+name);
	}
	
	public void enterPassword(String password) {
		System.out.println("Password : "+password);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData loginData=new LoginTestData();
		
		loginData.enterCredentials();
		loginData.enterUsername("pv");
		loginData.enterPassword("123123");
		
		loginData.navigateToHomePage();
	}

}
