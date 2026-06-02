void main() {

//	String str = "the lazy fox jumped over the brown fence";
//	StringTokenizer tokenizer = new StringTokenizer(str);

//	while(tokenizer.hasMoreTokens()) {
	//	IO.println(tokenizer.nextToken());
//	}


	String str = "jumped over";

	// In this case character `u` and `e` will be used as delimiters
	StringTokenizer tokenizer = new StringTokenizer(str, "ue");
	while(tokenizer.hasMoreTokens()) {
		IO.println(tokenizer.nextToken());
	}
}
