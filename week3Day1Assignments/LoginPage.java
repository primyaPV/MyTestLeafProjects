package week3Day1Assignments;

public class LoginPage extends BasePage{
	
	public void performCommonTasks() {
		System.out.println("Sorry It's Not worked");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage login=new LoginPage();
		login.findElement();
		login.enterText();
		login.clickElement();
		login.performCommonTasks();
	}

}
