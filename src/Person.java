public class Person 
{
	// fields to be encapsulated
	private String name;
	private int age;
	
	// a method that references the instance variables
	public void doStuff()
	{
		/*
		 * FOR ECLIPSE USERS:
		 * ------------------
		 * To encapsulate the fields and create get/set methods:
		 * 
		 * 1) Position your cursor over each field reference below
		 * 
		 * 2) Go to Refactor > Encapsulate Field...
		 * 
		 * 3) Select appropriate options in the dialog box, including
		 *    "add method comments" (which will add nearly-complete 
		 *    Javadoc comments for you!)
		 *    
		 * Alternatively: You can highlight the statements with the
		 * field declarations above and go to Source > Generate Getters and Setters...
		 * but note that, unlike Netbeans, it won't automatically replace 
		 * the two assignment statements in this method with calls to their
		 * respective "set" methods.
		 */
		name = "John Smith"; 
		age = 35;
	}
	
} // end class

