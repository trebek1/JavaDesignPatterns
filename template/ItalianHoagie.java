public class ItalianHoagie extends Hoagie {
	
	String[] meatUsed = {"Salami", "pepperoni", "Ham"};
	String[] cheeseUsed = {"american"};
	String[] veggiesUsed = {"Lettuce", "tomato"};
	String[] condimentsUsed = {"oil", "vinegar"};

	@Override
	void addMeat(){
		System.out.println("Adding the meat: ");
		for(String meat : meatUsed){
			System.out.println(meat + " ");
		}
	};

	@Override
	void addCheese(){
		System.out.println("Adding the cheese: ");
		for(String cheese : cheeseUsed){
			System.out.println(cheese + " ");
		}
	};

	@Override
	void addVegetables(){
		System.out.println("Adding the veg: ");
		for(String veg : veggiesUsed){
			System.out.println(veg + " ");
		}

	};

	@Override
	void addCondiments(){
		System.out.println("Adding the condiments: ");
		for(String c : condimentsUsed){
			System.out.println(c + " ");
		}
	};
}