public interface ATMState {
	// how user can interact with ATM
	void insertCard();
	void ejectCard();
	void insertPin(int pin);
	void requestCash(int cash);

}