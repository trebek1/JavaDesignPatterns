public class VeggieHoagie extends Hoagie {
	
	String[] veggiesUsed = {"Lettuce", "tomato"};
	String[] condimentsUsed = {"oil", "vinegar"};

	@Override
	void addMeat(){};

	@Override
	void addCheese(){};

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
	@Override
	boolean customerWantsMeat(){
		return false;
	}

	@Override
	boolean customerWantsCheese(){
		return false;
	}

}