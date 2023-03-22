package ch11.example.exam07;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void login(String id, String password) throws NotExistException, WrongPasswordException{
		//id가 blue가 아니라면 notexistIdException 발생시킴
		if(!id.equals("blue")) {
			throw new NotExistException("아이디가 존재하지 않습니다.");
		}
		//password 가 12345 가 아니라면 worngPasswordException을 발생시킴
		if(!password.equals("12345")) {
			throw new WrongPasswordException("패스워드가 틀립니다.");
		}
	}
}
