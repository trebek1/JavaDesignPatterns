class HasPin implements ATMState {
	ATMMachine atmMachine;

	public HasPin(ATMMachine newATMMachine){
		atmMachine = newATMMachine;
	}

	@Override
	public void insertCard(){
		System.out.println("already have a card");
	};

	@Override
	public void ejectCard(){
		System.out.println("Card Ejected");
		atmMachine.setATMState(atmMachine.getNoCardState());
	};

	@Override
	public void insertPin(int pin){
		System.out.println("already entered pin");
	};

	@Override
	public void requestCash(int cash){
		if(cash > atmMachine.cashInMachine){
			System.out.println("Dont have that much cash");
			System.out.println("Card ejected");
			atmMachine.setATMState(atmMachine.getNoCardState());

		} else {
			System.out.println(cash + "Is provided by the machine");
			atmMachine.setCashInMachine(atmMachine.cashInMachine - cash);
			System.out.println("Card ejected");
			atmMachine.setATMState(atmMachine.getNoCardState());
			System.out.println("The cash " + atmMachine.cashInMachine);
			if(atmMachine.cashInMachine <= 0){
				atmMachine.setATMState(atmMachine.getNoCashState());
			}
		}
	};
}