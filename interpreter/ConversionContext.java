public class ConversionContext {
	private String conversionQues = "";
	private String conversionResponse = "";
	private String fromConversion = "";
	private String toConversion = "";
	private Double quantity;

	String[] partsOfQues;

	public ConversionContext(String input){
		conversionQues = input;
		partsOfQues = getInput().split(" ");
		fromConversion = getCapitalized(partsOfQues[1]);

		// 1 gallons to pints
		toConversion = getLowerCase(partsOfQues[3]);

		quantity = Double.valueOf(partsOfQues[0]);

		conversionResponse = partsOfQues[0] + " " + partsOfQues[1] +
		" equals ";
	}

	public String getInput(){
		return conversionQues;
	}

	public String getFromConversion(){
		return fromConversion;
	}


	public String getToConversion(){
		return toConversion;
	}

	public String getResponse(){
		return conversionResponse;
	}

	public Double getQuantity(){
		return quantity;
	}

	public String getCapitalized(String word){
		word = word.toLowerCase();
		word = Character.toUpperCase(word.charAt(0)) + 
		word.substring(1);

		int length = word.length();

		if(word.charAt(length - 1) != 's'){
			word = new StringBuffer(word).insert(length, "s").toString(); 
		}
		return word;
	}

	public String getLowerCase(String wordToLowercase){
		return wordToLowercase.toLowerCase();
	}

}
