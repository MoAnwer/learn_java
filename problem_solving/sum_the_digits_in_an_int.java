void main() {
    IO.println(sumDigits(234));
}

public int sumDigits(long n) {
    int sum = 0, ext = 0;

    while (n != 0) {
        ext = (int)(n % 10); // 4, 3, 2
        n = (int)(n / 10); // 23, 2, 0
        sum += ext; // 0+4 = 4, 4+3=7
    }

    return sum;
}