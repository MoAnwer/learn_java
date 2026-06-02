import java.util.Scanner;

void main() {
//	int i = 0;
//	do {
//		i++;
//		IO.println(i);
//	} while (i < 100); // Condition gets checked AFTER the conent of loop executees


//	String theWord;
//	Scanner scan = new Scanner(System.in);
//
//	do {
///		theWord = scan.nextLine();
//	} while (!theWord.equals("Bird"));

//	IO.println(theWord);

	List<String> strings = new ArrayList<String>();
	strings.add("This");
	strings.add("is");
	strings.add("a for-each loop");

	for (String s : strings) {
		IO.println(s);
	}

//	int i = 4;
//	if (i < 2) {
//		System.out.println("i is less than 2");
//	} else if (i > 2) {
//		System.out.println("i is more than 2");
//	} else {
//		System.out.println("i is not less than 2, and not more than 2");
//	}

/*
	for(int i=9;i>0;i--){//Outer Loop
		System.out.println();
		for(int k=i;k>0;k--){//Inner Loop -1
			System.out.print(" ");
		}
		for(int j=i;j<=9;j++){//Inner Loop -2
			System.out.print(" "+j);
		}
	}
*/
//	String name = 1 > 2 ? "Mohamed" : "anwer";
//	IO.println(name);

	String age_input = "ab";

	try {
		int age = Integer.parseInt(age_input);
		if (age >= 18) {
			IO.println("You can vote!");
		} else {
			IO.println("You can't vote yet.");
		}
	} catch (NumberFormatException e)  {
		IO.println("Invalid input .'" + age_input + "' is not a valid integer");
	} finally {
		IO.println("This code will always be run, even if an exception is throw");
	}

}
