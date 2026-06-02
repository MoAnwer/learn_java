void main() {
	displayTable();
}

void displayTable() {
	IO.println(" Celsius  " + " Fahrenheit  " + "   |   " + "Fahrenheit  " + "  |   " + " Celsius ");
	IO.println("-------------------------------------------------------------");
	IO.println("  " + 40 + " 	 	" + celsiusToFahrenheit(40) + "  		" + 120 + "  		"
			+ fahrenheitToCelsius(120));
}

double celsiusToFahrenheit(double celsius) {
	double fahrenheit = (9.0 / 5) * celsius + 32;
	return fahrenheit;
}

double fahrenheitToCelsius(double fahrenheit) {
	double celsius = (5.0 / 9) * (fahrenheit - 32);
	return celsius;
}
