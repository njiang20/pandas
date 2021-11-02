public String doubleChar(String str) {
	String result = "";
	for (int x = 0; x < str.length(); x++) {
		result += str.substring(x, x + 1) + str.substring(x, x+1);
	}
	return result;
}

