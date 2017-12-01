public class MoreVariablesAndPrinting {
	
	public static void main(String[] args)
	{
		String myName, myEyes, myTeeth, myHair;
		int myAge, myHeight, myWeight;
		
		myName = "Zed A. Shaw";
		myAge = 35; //not a lie
		myHeight = 74; //inches
		myWeight = 180;
		myEyes = "Blue";
		myTeeth = "White";
		myHair = "Brown";
		
		System.out.println("Let's talk about " + myName + ".");
		System.out.println("He's " + myHeight + " inches tall.");
		System.out.println("He's " + myWeight + " pounds heavy");
		System.out.println("Actually, that's not too heavy");
		System.out.println("He's got " + myEyes + " eyes and " + myHair + " hair.");
		System.out.println("His teetch are usually " + myTeeth + " depending on the coffee.");
		
		System.out.println("If i add " + myAge + ", " + myHeight + " , and " + myWeight + " I get " + (myAge + myHeight +myWeight) + ".");
		
		//a: the line of codedefines those words as variables
		//b:
		
		System.out.println("Let's talk about " + myName + ".");
		System.out.println("He's " + myHeight + " inches (or " + (myHeight * 2.54) + " cm) tall.");
		System.out.println("He's " + myWeight + " (or" + (myWeight * 0.454) + " kg) pounds heavy");
		System.out.println("Actually, that's not too heavy");
		System.out.println("He's got " + myEyes + " eyes and " + myHair + " hair.");
		System.out.println("His teetch are usually " + myTeeth + " depending on the coffee.");
		
		System.out.println("If i add " + myAge + ", " + myHeight + " , and " + myWeight + " I get " + (myAge + myHeight +myWeight) + ".");
	}

}