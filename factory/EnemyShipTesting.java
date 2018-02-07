import java.util.Scanner;

public class EnemyShipTesting {
	public static void main(String[] args){

		EnemyShipFactory shipFactory = new EnemyShipFactory();

		EnemyShip theEnemy = null;

		Scanner userInput = new Scanner(System.in);

		System.out.println("What type of ship? (U/R/B)");

		if(userInput.hasNext()){
			String typeOfShip = userInput.nextLine();

			theEnemy = shipFactory.makeEnemyShip(typeOfShip);
		}

		if(theEnemy != null){
			doStuffEnemy(theEnemy);
		} else {
			System.out.println("Enter a U R or B next time");
		}


		// Bad to do this logic here. Use a factory! 
		// EnemyShip ufoShip = new UFOEnemyShip();

		// EnemyShip theEnemy = null;

		// Scanner userInput = new Scanner(System.in);
		// System.out.println("What type of ship? (U/R)? ");

		// String enemyShipOption = "";

		// if(userInput.hasNextLine()){
		// 	enemyShipOption = userInput.nextLine();
		// }

		// if(enemyShipOption.equals("U")){
		// 	theEnemy = new UFOEnemyShip();
		// } else if(enemyShipOption.equals("R")){
		// 	theEnemy =  new RocketEnemyShip();
		// }
	}

	public static void doStuffEnemy(EnemyShip anEnemyShip){
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
}