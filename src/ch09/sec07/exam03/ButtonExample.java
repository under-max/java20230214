package ch09.sec07.exam03;

public class ButtonExample {
	public static void main(String[] args) {
		//ok버튼 객체생성
		Button btnOk = new Button();
		
		//ok버튼 객체에 clicklistener 구현객체 주입
		
		btnOk.setClickListener(new Button.ClickListener() {
			@Override
			public void onCLick() {
				System.out.println("OK 버튼을 클릭했습니다.");
			}
		});
		
		btnOk.click();
		
		//Cancle 버튼객체생성
		
		Button btnCancle = new Button();
		
		btnCancle.setClickListener(new Button.ClickListener() {
			@Override
			public void onCLick() {
				System.out.println("Cancle 버튼을 클릭했습니다.");
			}
		});
		
		//Cancle버튼 클릭하기
		btnCancle.click();
	}
}
