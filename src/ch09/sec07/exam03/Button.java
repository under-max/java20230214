package ch09.sec07.exam03;

public class Button {
	public static interface ClickListener {
		void onCLick();
	}
	
	//필드
	private ClickListener clickListener;
	
	//메소드
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onCLick();
	}
	
}
