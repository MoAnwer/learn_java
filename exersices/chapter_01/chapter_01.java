import java.util.StringJoiner;

void main()
{
    double pi = 4 * ( 1.0 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13);

    // int[] arr = reverseArray(new int[] {1, 2, 3, 4});

    // IO.println(Arrays.toString(arr));

    numberOfYears(100000000);
    
}

void perimeterOfCircle(double radius, double pi)
{
    double perimeter = 2 * radius * pi;
    IO.println(perimeter);
}

void population() 
{
    int currentPopulation = 312032486;
    double secondInYear = 60 * 60 * 24 * 365;
    double birth = secondInYear / 7.0;
    double death = secondInYear / 13.0;
    double immigrant = secondInYear / 45.0;

    double netChangePerYear = birth - death + immigrant;

    for (int i = 1; i <= 5; i++) {
        currentPopulation += netChangePerYear;
        System.out.printf("Year %d projection: %,d%n", i, currentPopulation);
    }
}

int[] reverseArray(int[] arr)
{
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
        
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        start++;
        end--;
    }
    return arr;
}


/**
 * (Find the number of years) Write a program that prompts the user to enter the
 * minutes (e.g., 1 billion), and displays the number of years and days for the minutes. 
 * For simplicity, assume a year has 365 days.
 * 
 * @param minutes
 */
void numberOfYears(int minutes) 
{
    int daysFromMinutes = (minutes / 60) / 24;
    int numberOfYears = daysFromMinutes / 365;
    int numberOfDays = numberOfYears > 0 ? daysFromMinutes % numberOfYears : daysFromMinutes;
    IO.println(String.format("%,d minutes is approximately %d years and %d days", minutes, numberOfYears, numberOfDays));
}