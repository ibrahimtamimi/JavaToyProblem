//=============================================================================
/*									String API								 */
//=============================================================================
	//1) To convert string to Array
		String s1="hello";  
		char[] ch=s1.toCharArray();  // returns an array ['h','e','l','l','o']

	//2) to get char at index
		String name="javatpoint";  
		char ch=name.charAt(4);	// returns the char value at the 4th index  't'

	//3) prefix : Sequence of character
		String s1="java string split method by javatpoint";  
		System.out.println(s1.startsWith("ja"));  // return true
		System.out.println(s1.startsWith("java string")); // return false

	//4) split string and return an array
		String s1="java string split method by javatpoint";  
		String[] words=s1.split("\\s");//splits the string based on whitespace it returns ['java', 'string', 'split', 'method', 'by', 'javatpoint']

	//5) to join string and add something between 
		String joinString1=String.join("-","welcome","to","javatpoint");  
		System.out.println(joinString1);  

	//5) get the indexOf the string 
		String s1="this is index of example";  
		int index4=s1.indexOf('s'); //returns the index of s char value  
		System.out.println(index4); //3  

	//6) to concat string with another string
		String s1="java string";  
		s1 = s1.concat("is immutable");  
		System.out.println(s1);  // java stringis immutable
	
	//7) to know if string contins the params value
		String name="what do you know about me";  
		System.out.println(name.contains("do you know"));  // true
		System.out.println(name.contains("about"));  // true
		System.out.println(name.contains("hello")); // false

	//8 to return string length
		String s1="javatpoint";  
		String s2="python";  
		System.out.println("string length is: "+s1.length());//10 is the length of javatpoint string  
		System.out.println("string length is: "+s2.length());//6 is the length of python string  

//=============================================================================
/*									Array API								 */
//=============================================================================

	// to convert array to string
		int[] intArray = { 1, 2, 3, 4, 5 };
		String intArrayString = Arrays.toString(intArray);
  		System.out.println(intArrayString); //[1, 2, 3, 4, 5]