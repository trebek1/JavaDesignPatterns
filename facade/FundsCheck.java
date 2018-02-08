public class FundsCheck {
	private double cashInAccount = 1000.00;

	public double getCashInAccount(){
		return this.cashInAccount;
	}

	public void decreaseCashInAccount(double cashWithdraw){
		cashInAccount -= cashWithdraw;
	}

	public void increaseCashInAccount(double cashDeposit){
		cashInAccount += cashDeposit;
	}

	public boolean haveEnoughMoney(double cashWithdraw){
		if(cashWithdraw > getCashInAccount()){
			System.out.println("Dont have enough cash");
			System.out.println("balance: " + getCashInAccount());
			return false;
		} else {
			decreaseCashInAccount(cashWithdraw);
			System.out.println("Success, Balance is: " + getCashInAccount());
			return true;
		}
	}

	public void makeDeposit(double cashToDeposit){
		increaseCashInAccount(cashToDeposit);
		System.out.println("New Balance: " + getCashInAccount());
	}
}