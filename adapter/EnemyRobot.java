// adaptee

import java.util.Random;

class EnemyRobot {
	Random generator = new Random();

	public void smashWithHands(){
		int attackDamage = generator.nextInt(10) + 1;

		System.out.println("Enemy robot causes attack damage " + attackDamage);
	}

	public void walkForward(){
		int movement = generator.nextInt(5) + 1;
		System.out.println("Enemy walks " + movement);
	}

	public void reactToHuman(String driverName){
		System.out.println("Enemy robot tramps " + driverName);
	}
}
