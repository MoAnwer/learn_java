import java.util.StringJoiner;

void main()
{
    double pi = 4 * ( 1.0 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13);

    // population();

    int[] arr = reverseArray(new int[] {1, 2, 3, 4});

    IO.println(Arrays.toString(arr));
    
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