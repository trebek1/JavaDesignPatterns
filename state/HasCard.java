class HasCard implements ATMState {

	ATMMachine atmMachine;

	public HasCard(ATMMachine newATMMachine){
		atmMachine = newATMMachine;
	}

	@Override
	public void insertCard(){
		System.out.println("You cant enter more than one card");
	};

	@Override
	public void ejectCard(){
		System.out.println("Card Ejected");
		atmMachine.setATMState(atmMachine.getNoCardState());
	};

	@Override
	public void insertPin(int pin){
		if(pin == 1234){
			System.out.println("Correct Pin");
			atmMachine.correctPinEntered = true;
			atmMachine.setATMState(atmMachine.getHasPin());
		} else {
			System.out.println("Wrong Pin");
			atmMachine.correctPinEntered = false;
			System.out.println("Card Ejected");
			atmMachine.setATMState(atmMachine.getNoCardState());
		}
	};

	@Override
	public void requestCash(int cash){
		System.out.println("Enter pin first");
	};
}