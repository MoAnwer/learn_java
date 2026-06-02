void main() {
    displayPattern(10);
}

void displayPattern(int n)  {

    for(int i = 1; i <= n; i++) 
    {
        for (int j = 1; j <= i; j++) 
        {
            IO.print(j + " ");
        }
        IO.println();
    }
}