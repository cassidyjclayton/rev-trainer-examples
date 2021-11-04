package demoPackage;

public class Types {
	//Primitive Data Types!
	
	


	//Descending Size Numbers: 
		byte myByte = 1; //8 bits.half a short
		short mySmallNumber = 20; //half an int, 16 bits
	
	// Decimal Nums:
		float myDecimal = 1.05f; //Floats are Notoriously inaccurate!!!!! -- Doesn't track decimals well at all! must append 'f' or Java thinks its a double
		double MyMorePreciseDecimal = 1.06; //128 bits,double precision decimal--more capacity for data, solves some problems of floats
		int myWholeNumber = 2019; //short for integer. 32 bits, whole nums only
		long myBigNumber =525600; // 64 bit num
	// True/False
		boolean myTrueOrFalse; //2 bytes (or 16 bits)
	// Character
		char myCharacter; //16 bits (2 bytes) stores ASCII
	// Reference
		Object o; // Refs are 32 bits on an x86 (32-bit machine) and 64 bits on an x64 machine)
	/* Ways to name classes and variables in Java
	 * camelCase -- for variables
	 * PascalCase -- for classes
	 * snake_case
	 * kebab-case
	 * Never Any Spaces!
	 * No Numbers!
	 * Variables named as their Purpose!
	 */
	//My First Method:
		public void PrintMyValues() {
			System.out.println("\n My values are: " + myByte + ", " + mySmallNumber + ", and " + myDecimal);
		}
		
}
