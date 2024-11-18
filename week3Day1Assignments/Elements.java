package week3Day1Assignments;

public class Elements extends Button{
	
	public static void main(String[] args) {
		
		WebElement web=new WebElement();
		web.click();
		web.setText("pv");
		
		TextField text=new TextField();
		 text.getText();
		 
		 Button button=new Button();
		 button.submit();
		 
		 CheckBoxButton checkButton=new CheckBoxButton();
		 checkButton.clickCheckButton();
		 
		 RadioButton radioButton= new RadioButton();
		 radioButton.selectRadioButton();
		
	}

}
