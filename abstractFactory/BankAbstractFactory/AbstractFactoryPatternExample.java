import java.io.*;

class AbstractFactoryPatternExample {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter bank name for loan");

		String bankName = br.readLine();
		System.out.println("\n");
		System.out.println("Enter type of loan (Business or Education)");
		String loanName = br.readLine();

		AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
		Bank b = bankFactory.getBank(bankName);

		System.out.println("\n");
		System.out.println("Enter the interest rate for " + b.getBankName());

		double rate = Double.parseDouble(br.readLine());
		System.out.println("\n");

		System.out.print("Enter the loan amount you want to take: ");

		double loanAmount = Double.parseDouble(br.readLine());
		System.out.println("\n");

		System.out.print("Enter the number of years to pay your entire loan amount: ");  
		int years = Integer.parseInt(br.readLine());

		System.out.println("\n");
		System.out.println("you are taking the loan from "+ b.getBankName());

		AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");

		Loan l = loanFactory.getLoan(loanName);

		// this is actually setting the interest rate from the user 
		l.getInterestRate(rate);
		l.calculateLoanPayment(loanAmount, years);

	}
}