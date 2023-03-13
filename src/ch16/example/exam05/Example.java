package ch16.example.exam05;

public class Example {
	public static void main(String[] args) {
		Button btnOk = new Button();
		btnOk.setClickListener(()->System.out.println("Ok버튼을 클릭했습니다."));
		btnOk.click();
		
		//ok버튼을 클릭했습니다.
		
		Button btnCancel = new Button();
		btnCancel.setClickListener(()->System.out.println("Cancel버튼을 클리했습니다."));
		
		btnCancel.click();
		
		//Calcel버튼을 클릭했습니다. 
	}
}
