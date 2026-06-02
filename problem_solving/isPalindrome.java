void main() 
{
    try 
    {
        int number = Integer.parseInt(IO.readln("Enter number: "));
        IO.println(reverse(number));
        IO.println(isPalindromeNumber(number));    

    } catch (NumberFormatException e) 
    {
        IO.println("Invalid number, please try another number");

    }
    
}


int reverse(int number) 
{
    boolean isNegative = number < 0;

    if (isNegative) {
        number = Math.abs(number);
    }

    StringBuilder strNum = new StringBuilder();

    int extracted = 0;

    while (number != 0) {
        extracted = number % 10;
        number = number / 10;
        strNum.append(extracted);
    }

    if(strNum.length() == 0) {
        return 0;
    }

    int reversedValues = Integer.parseInt(strNum.toString());

    return isNegative ? -reversedValues : reversedValues;
}

boolean isPalindromeNumber(int number) 
{
    return reverse(number) == number;
}