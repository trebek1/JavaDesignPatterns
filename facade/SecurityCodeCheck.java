public class SecurityCodeCheck {
	private int securityCode = 1234;

	public int getSecurityCode(){
		return securityCode;
	}

	public boolean isCodeCorrect(int code){
		if(code == getSecurityCode()){
			return true;
		}
		return false;
	}	
}