public class BankAccountFacade{
	private int accountNumber;
	private int securityCode;

	AccountNumberCheck acctChecker;
	SecurityCodeCheck codeChecker;
	FundsCheck fundChecker;

	WelcomeToBank bankWelcome;

	public BankAccountFacade(int newAccountNumber, int newSecCode){
		accountNumber = newAccountNumber;
		securityCode = newSecCode;
		
		bankWelcome = new WelcomeToBank();
		acctChecker = new AccountNumberCheck();
		codeChecker = new SecurityCodeCheck();
		fundChecker = new FundsCheck();

	}

	public int getAccountNumber(){
		return accountNumber;
	}

	public int getSecurityCode(){
		return securityCode;
	}

	public void withdrawCash(double cashToGet){
		if(acctChecker.accountActive(getAccountNumber()) &&
			codeChecker.isCodeCorrect(getSecurityCode())&& 
			fundChecker.haveEnoughMoney(cashToGet)){
			System.out.println("transaction complete");
		} else {
			System.out.println("transaction failed");
		}
	}

	public void depositCash(double cashToDeposit){
		if(acctChecker.accountActive(getAccountNumber()) &&
			codeChecker.isCodeCorrect(getSecurityCode())){
			fundChecker.makeDeposit(cashToDeposit);
		} else {
			System.out.println("transaction failed");
		}
	}
}