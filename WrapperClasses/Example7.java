class Example7 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		String s1="100";
		
		Integer it1=Integer.parseInt(s1);
		int num=Integer.parseInt(s1);
		System.out.println(num + " "  + it1);
		// Floating-point numbers
		double d = Double.parseDouble("3.14159");
		float f = Float.parseFloat("2.718f");

			// Whole numbers (smaller or larger than int)
			long l = Long.parseLong("9876543210");
			short s = Short.parseShort("32000");
			byte b = Byte.parseByte("127");

			// Booleans (Parses "true" case-insensitive to true; anything else is false)
			boolean b1 = Boolean.parseBoolean("TRUE");  // returns true
			boolean b2 = Boolean.parseBoolean("hello"); // returns false

	}
}
