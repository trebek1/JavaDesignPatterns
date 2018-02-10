abstract class Loan{
	protected double rate; 
	abstract void getInterestRate(double rate);
	public void calculateLoanPayment(double loanAmount, int years){
		double monthlyRate;
		int n; 

		n = years * 12;
		rate = rate/1200;

		monthlyRate = ((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanAmount; 
		System.out.println("your monthly rate is "+ monthlyRate + " for the amount " + loanAmount + " borrowed");
	}
}