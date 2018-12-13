
public class TeaParty {

	public static  String welcome(String name, boolean isWoman, boolean isKnighted)
    {

		if(isWoman == true && isKnighted == false) {
			return "Hello Ms. " + name;
		}
		
		if(isWoman == true && isKnighted == true) {
			return "Hello Lady " + name;
		}
		if(isWoman == false && isKnighted == false) {
			return "Hello Mr. " + name;
		}
		if(isWoman == false && isKnighted == true) {
			return "Hello Sir " + name;
		}
		
			return name;
		
		
    }
}

	
	
	
	
	
	/*public static void main(String[] args) {
	welcome("1234567890", true, false);
	TeaParty party = new TeaParty();
	party.welcome("0", true, true);
}
}*/

