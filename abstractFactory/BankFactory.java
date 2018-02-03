class BankFactory extends AbstractFactory{
	public Bank getBank(String bank){
		if(bank == null){
			return null;
		}

		if (bank.equalsIgnoreCase("GoldmanSachs")) {
			return new GoldmanSachs();
		} else if(bank.equalsIgnoreCase("UBS")) {
			return new UBS();
		} else if (bank.equalsIgnoreCase("WellsFargo")) {
			return new WellsFargo();
		}

		return null;
	}

	public Loan getLoan(String loan){
		return null;
	}
}