package week3Day1Assignments;

public class BasePage {

	
	public void findElement() {
		System.out.println("Find The Elements");
	}
	
	public void clickElement() {
		System.out.println("Clicked the Elements");
	}
	
	public void enterText() {
		System.out.println("Enter the text");
	}
	
	public void performCommonTasks() {
		System.out.println("It's worked successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasePage base=new BasePage();
		base.findElement();
		base.enterText();
		base.clickElement();
		base.performCommonTasks();
	}
	
	
}
