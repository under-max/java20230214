package ch16.sec02.exam02;

public class ButtonExample {
	public static void main(String[] args) {
		Button btnOk = new Button();
		//700 lambda - > 420 anonymous -> 412 concreate class
		//ok버튼객체에 람다식 주입
		
		
		btnOk.setClickListener(()->{
			System.out.println("Ok버튼을 클릭했습니다.");
		});
		
		btnOk.click();
		
		Button btnCancel = new Button();
		
		btnCancel.setClickListener(()->{
			System.out.println("Cancel버튼을 클릭했습니다.");
		});
		
		
		
		btnCancel.click();
		
	}
}
